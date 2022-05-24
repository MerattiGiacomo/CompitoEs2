public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Benvenuti al museo!");
        Museo museo = new Museo();
        Visitatore v1 = new Visitatore("Gino", museo);
        Visitatore v2 = new Visitatore("Antonio", museo);
        Visitatore v3 = new Visitatore("Roberto", museo);
        Visitatore v4 = new Visitatore("Arnold", museo);
        Visitatore v5 = new Visitatore("Bini", museo);

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();
        v5.join();
    }
}
