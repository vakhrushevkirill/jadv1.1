public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        final Thread thread1 = new MyThread(mainGroup, "Поток 1");
        final Thread thread2 = new MyThread(mainGroup, "Поток 2");
        final Thread thread3 = new MyThread(mainGroup, "Поток 3");
        final Thread thread4 = new MyThread(mainGroup, "Поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);
        mainGroup.interrupt();
    }
}
