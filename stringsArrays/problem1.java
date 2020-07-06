import java.util.HashSet;
public class problem1 {
    public static void main(String[] args) {
        assert testStr("hello there") == false;
        assert testStr("the");
        assert testStr("abc123");
        assert testStr("abcdefghijklmnopqrstuvwxyz");
        assert testStr("potato") == false;
        assert testStr("");
        assert testStr("a");
        assert testStr("aa") == false;
        assert testStr("abba") == false;
        System.out.println("All Tests Passed!");
    }
    
    private static Boolean testStr(String str) {
        return allUniqueChars(str) && allUniqueNoDataStructs(str);
    }

    private static Boolean allUniqueChars(String str) {
        char[] chars = str.toCharArray();
        HashSet<Character> charSet = new HashSet<Character>();
        for (char c : chars) {
            if (charSet.add(c) == false) {
                return false;
            }
        }
        return true;
    }

    private static Boolean allUniqueNoDataStructs(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}