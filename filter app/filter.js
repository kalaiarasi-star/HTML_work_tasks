const video = document.getElementById("video")
const canvas = document.getElementById("canvas")
const gallery = document.getElementById("photoGallery")
const timer = document.getElementById("timer")

let stream
let currentCamera = "user"
let mediaRecorder
let recordedChunks = []

let timerInterval
let seconds = 0

startCamera()

function startCamera(){

navigator.mediaDevices.getUserMedia({
video:{facingMode:currentCamera},
audio:true
}).then(s=>{

stream=s
video.srcObject=s

})

}

function switchCamera(){

currentCamera = currentCamera==="user" ? "environment" : "user"

stream.getTracks().forEach(track=>track.stop())

startCamera()

}

function setFilter(filter){

video.style.filter = filter

}

function capturePhoto(){

const ctx = canvas.getContext("2d")

canvas.width = video.videoWidth
canvas.height = video.videoHeight

ctx.filter = video.style.filter
ctx.drawImage(video,0,0)

const img = canvas.toDataURL()

createPhotoCard(img)

}

function createPhotoCard(src){

const card=document.createElement("div")
card.className="photoCard"

const img=document.createElement("img")
img.src=src

const actions=document.createElement("div")
actions.className="actions"

const download=document.createElement("button")
download.innerText="⬇"
download.onclick=()=>{
const link=document.createElement("a")
link.href=src
link.download="photo.png"
link.click()
}

const del=document.createElement("button")
del.innerText="🗑"
del.onclick=()=>card.remove()

const share=document.createElement("button")
share.innerText="📤"

share.onclick=async()=>{

if(navigator.share){

const blob=await (await fetch(src)).blob()
const file=new File([blob],"photo.png",{type:"image/png"})

navigator.share({
files:[file],
title:"My Photo"
})

}else{
alert("Share not supported")
}

}

actions.append(download,share,del)

card.append(img,actions)

gallery.appendChild(card)

}

function startRecording(){

recordedChunks=[]

mediaRecorder=new MediaRecorder(stream)

mediaRecorder.ondataavailable=e=>{
if(e.data.size>0){
recordedChunks.push(e.data)
}
}

mediaRecorder.onstop=()=>{

const blob=new Blob(recordedChunks,{type:"video/webm"})
const url=URL.createObjectURL(blob)

const link=document.createElement("a")
link.href=url
link.download="video.webm"
link.click()

}

mediaRecorder.start()

startTimer()

}

function stopRecording(){

mediaRecorder.stop()

stopTimer()

}

function startTimer(){

timer.style.display="block"
seconds=0

timerInterval=setInterval(()=>{

seconds++

let mins=Math.floor(seconds/60)
let secs=seconds%60

timer.textContent=
String(mins).padStart(2,'0')+":"+
String(secs).padStart(2,'0')

},1000)

}

function stopTimer(){

clearInterval(timerInterval)
timer.style.display="none"

}

function openTab(id){

document.querySelectorAll(".tab").forEach(t=>{
t.classList.remove("active")
})

document.getElementById(id).classList.add("active")

}

function toggleTheme(){

document.body.classList.toggle("light")

}