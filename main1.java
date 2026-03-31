class MyThread extends Thread{
public void run(){
System.out.println("Running thread : " + Thread.currentThread().getName());
}
}

public class main1{
public static void main(String[] args){
MyThread t1 = new MyThread();
//for two diff thread
MyThread t2 = new MyThread();

//This for set method
t1.setName("Worker-1");
t2.setName("Worker-2");


t1.start();
t2.start();  

System.out.println("Main thread: " + Thread.currentThread().getName());
}
}