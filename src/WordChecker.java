import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    protected String text;
    Set<String> set = new HashSet<>();

    public WordChecker(String text) {
        this.text = text;
        String[] item = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, item);
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
