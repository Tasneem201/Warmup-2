public class StringBits {

    // Method to return every other character starting from index 0
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        StringBits sb = new StringBits();

        System.out.println(sb.stringBits("Hello"));       // Hlo
        System.out.println(sb.stringBits("Hi"));          // H
        System.out.println(sb.stringBits("Heeololeo"));   // Hello
        System.out.println(sb.stringBits(""));            // (empty string)
        System.out.println(sb.stringBits("A"));           // A
    }
}

