public class FrontTimes {

    // Method to return n copies of the "front" of the string
    public String frontTimes(String str, int n) {
        String front;

        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();

        System.out.println(ft.frontTimes("Chocolate", 2)); // ChoCho
        System.out.println(ft.frontTimes("Chocolate", 3)); // ChoChoCho
        System.out.println(ft.frontTimes("Abc", 3));        // AbcAbcAbc
        System.out.println(ft.frontTimes("A", 4));          // AAAA
        System.out.println(ft.frontTimes("", 3));           // (empty string)
    }
}

