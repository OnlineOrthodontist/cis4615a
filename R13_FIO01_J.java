public class R13_FIO01_J {
   public static void main(String[] args) throws IOException {
        File file = new File("someFile.txt");
        if (!file.delete()) {
            // Handle failure to delete the file
        }
    }
}
