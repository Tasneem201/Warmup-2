public class StringYak {

    // Method to remove "yak" patterns, where 'a' can be any character
    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3; // skip the "yak" pattern
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        StringYak sy = new StringYak();

        System.out.println(sy.stringYak("yakpak"));       // pak
        System.out.println(sy.stringYak("pakyak"));       // pak
        System.out.println(sy.stringYak("yak123ya"));     // 123ya
        System.out.println(sy.stringYak("yayak"));        // ya
        System.out.println(sy.stringYak("yakyakyak"));    // (empty string)
    }
}

