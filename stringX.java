public class StringX {

    // Method to remove all 'x' chars except at the very start or end
    public String stringX(String str) {
        if (str.length() <= 2) {
            return str;
        }

        String start = str.substring(0, 1); // first character
        String end = str.substring(str.length() - 1); // last character
        String middle = str.substring(1, str.length() - 1).replace("x", "");

        return start + middle + end;
    }

    // Main method for testing
    public static void main(String[] args) {
        StringX sx = new StringX();

        System.out.println(sx.stringX("xxHxix"));      // xHix
        System.out.println(sx.stringX("abxxxcd"));     // abcd
        System.out.println(sx.stringX("xabxxxcdx"));   // xabcdx
        System.out.println(sx.stringX("x"));           // x
        System.out.println(sx.stringX(""));            // (empty string)
        System.out.println(sx.stringX("abc"));         // abc
    }
}

