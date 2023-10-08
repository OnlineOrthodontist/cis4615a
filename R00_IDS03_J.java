public class R00_IDS03_J{
    public static void main(String[] args) {
        boolean loginSuccessful = true;
        String username = "admin";
        System.out.println("User login " + (loginSuccessful ? "succeeded" : "failed") + " for: " + sanitizeUser(username));
    }

    public static String sanitizeUser(String username) {
        return username.matches("[A-Za-z0-9]+") ? username : "unauthorized user";
    }
}
