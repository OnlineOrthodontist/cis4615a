public class R02_XP00_J {
    public static void main(String[] args) {
        // Assume someFileName.txt exists
        File someFile = new File("someFileName.txt");
        someFile.delete();
    }
}