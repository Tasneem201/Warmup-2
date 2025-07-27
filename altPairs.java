public class AltPairs {

    // Method to return characters at indexes 0,1  4,5  8,9 ...
    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i)); // char at i
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1)); // char at i+1
            }
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        AltPairs ap = new AltPairs();

        System.out.println(ap.altPairs("kitten"));        // kien
        System.out.println(ap.altPairs("Chocolate"));     // Chole
        System.out.println(ap.altPairs("CodingHorror"));  // Congrr
        System.out.println(ap.altPairs("a"));             // a
        System.out.println(ap.altPairs(""));              // (empty string)
    }
}

