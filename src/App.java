public class App {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        String apiUrl = config.getProperty("apiUrl");
        System.out.println("API URL: " + apiUrl);
    }
}
