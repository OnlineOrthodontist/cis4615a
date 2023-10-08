public class R02_XP00_J {
   public static void main(String[] args) {
        // Assume someFileName.txt exists
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            System.out.println("Failed to delete file.");
        }
    }
}
