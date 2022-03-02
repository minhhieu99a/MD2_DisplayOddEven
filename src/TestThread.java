public class TestThread {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        ot.start();
        try {
            ot.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        EvenThread et=new EvenThread();
        et.start();
        try {
            et.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
