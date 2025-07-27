public class Last2 {

    // Method to count how many times the last 2 chars appear in the string (excluding the end)
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String last2 = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(last2)) {
                count++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Last2 l2 = new Last2();

        System.out.println(l2.last2("hixxhi"));      // 1
        System.out.println(l2.last2("xaxxaxaxx"));   // 1
        System.out.println(l2.last2("axxxaaxx"));    // 2
        System.out.println(l2.last2("ab"));          // 0 (only one occurrence of last 2 chars)
        System.out.println(l2.last2("a"));           // 0 (too short)
        System.out.println(l2.last2("xxxx"));        // 2 (xx at 0–1 and 1–2 match final "xx")
    }
}

