public class R49_MSC02_J {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(1000000);
        System.out.println("Random number: " + x);
    }
}
