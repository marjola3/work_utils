package dzielenie_wyrazu;


import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String title = "alamakot";

        try {
            StringTokenizer st = new StringTokenizer();
            List<String> tokens = st.splitText(title);
            System.out.println(tokens);
        } catch (IllegalArgumentException e) {
            System.out.println("Błędny parametr wejściowy: " + e);
        }
    }
}
