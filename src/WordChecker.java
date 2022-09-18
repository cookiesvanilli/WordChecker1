import java.util.HashMap;
import java.util.Set;

public class WordChecker {
    protected String text;

    public WordChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] item = text.split("\\P{IsAlphabetic}+");
        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (key.contains(word)) {
                return true;
            }

        }
        return false;

    }
}
