package C18Thread;

public class RunnableimplementsClass implements Runnable{
    @Override
    public void run() {
        System.out.println("RunnableimplementsClass" + Thread.currentThread().getName());
    }
}
