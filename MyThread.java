class MyThread extends Thread{
public void run(){
System.out.println("Thread is running");
}
public static void main(String[] args){
MyThread t = new MyThread();
t.start();
}
}

class MyTask implements runnable{
public void run(){
System.out.println("Task running");
}
}

public class main1{
public static void main(String[] args){
Thread t1 = new Thread(new MyTask());
t1.start();
}
}