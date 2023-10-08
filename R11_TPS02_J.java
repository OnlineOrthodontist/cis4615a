public class R11_TPS02_J {
     private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(new Task()).start();
        flag = true;
    }

    private static class Task implements Runnable {
        public void run() {
            if (flag) {
                System.out.println("Flag is true.");
            }
        }
    }
}
