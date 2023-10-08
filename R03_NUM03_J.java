public class R03_NUM03_J {
     public static void main(String[] args) throws IOException {
        DataInputStream is = new DataInputStream(new FileInputStream("someFile.txt"));
        System.out.println(getInteger(is));
    }

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
}
