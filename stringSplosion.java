public class StringSplosion {

    // Method that builds up the string in incremental pieces
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        StringSplosion ss = new StringSplosion();

        System.out.println(ss.stringSplosion("Code"));  // CCoCodCode
        System.out.println(ss.stringSplosion("abc"));   // aababc
        System.out.println(ss.stringSplosion("ab"));    // aab
        System.out.println(ss.stringSplosion("a"));     // a
        System.out.println(ss.stringSplosion("xyz"));   // xxyxyz
    }
}

