import java.util.HashMap;
public class problem2 {
    public static void main(String[] args) {
        assert isPerm("abc", "bca");
        assert isPerm("abba", "aba") == false;
        assert isPerm("", "");
        assert isPerm("ab", "ba");
        assert isPerm("abcd", "dbca");
        assert isPerm("abc", "bc") == false;
        assert isPerm("", "1");
        assert isPerm("123", "321");
        assert isPerm("Hi there", "hi there") == false;
        System.out.println("all tests passed");
    }

    private static Boolean isPerm(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> freqs1 = CharFreqs(s1);
        HashMap<Character, Integer> freqs2 = CharFreqs(s2);
        return freqs1.equals(freqs2);
    }

    private static HashMap<Character, Integer> CharFreqs(String s) {
        HashMap<Character, Integer> freqs = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (freqs.containsKey(c)) {
                freqs.replace(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }
        return freqs;
    }
}