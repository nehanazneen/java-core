
import java.util.*;

public class Matcher {
    public static List<String> findMatchedWords(String[] dict, String pattern) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        String hashPattern = encodeString(pattern);

        for (String word : dict) {
            String hashWord = encodeString(word);
            if (hashWord.equals(hashPattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private static String encodeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder hash = new StringBuilder();
        int i = 0;

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, i++);
            }
            hash.append(map.get(ch));
        }

        return hash.toString();
    }

    public static void main(String[] args) {
        String[] dict = {"abb", "abc", "xyz", "xyy", "foo"};
        String pattern = "foo";

        List<String> matchedWords = findMatchedWords(dict, pattern);
        System.out.println("Words matching the pattern:");
        for (String word : matchedWords) {
            System.out.println(word);
        }
    }
}
