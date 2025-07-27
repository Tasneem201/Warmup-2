public class StringMatch {

    // Method to count how many 2-char substrings match at the same position in both strings
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if (subA.equals(subB)) {
                count++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        StringMatch sm = new StringMatch();

        System.out.println(sm.stringMatch("xxcaazz", "xxbaaz"));  // 3
        System.out.println(sm.stringMatch("abc", "abc"));         // 2
        System.out.println(sm.stringMatch("abc", "axc"));         // 0
        System.out.println(sm.stringMatch("a", "a"));             // 0 (not enough chars)
        System.out.println(sm.stringMatch("abcdef", "ab"));       // 1
    }
}

