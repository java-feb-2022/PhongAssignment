import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Hotel California -Cover", "On a dark desert highway, cool wind in my hair");
        trackMap.put("Sweet Home Alabama- Cover", "Sweet home Alabama, where the skies are so blue");
        trackMap.put("Fly Me To the Moon-Cover", "Fly to the moon. Let me sing among the stars...");
        trackMap.put("Perfect-Cover", "I found a girl...");

        String getSong = trackMap.get("Fly Me To the Moon-Cover");
        System.out.println("The lyrics for the song Fly Me To the Moon is " + getSong);

        for (String key : trackMap.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key,
                    trackMap.get(key)));
        }

    }
}
