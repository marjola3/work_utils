package dzielenie_wyrazu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mariola on 2014-04-28.
 */
public class StringTokenizer {
    private static final int TITLE_LENGHT = 8;

    private static final int SUBTITLE_LENGHT = 2;

    public List<String> splitText(String text) {
        if(text == null
                || text.trim().length() == 0
                || text.length() > TITLE_LENGHT) {
            throw new IllegalArgumentException();
        }

        List<String> subtitles = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            sb.append(text.charAt(i));
            if ((i+1) % SUBTITLE_LENGHT == 0) {
                subtitles.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        if (sb.length() > 0) {
            subtitles.add(sb.toString());
        }

        return subtitles;
    }
}
