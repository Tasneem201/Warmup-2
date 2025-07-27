public class StringTimes {

    // Method to return n copies of the original string
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(str);
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        StringTimes st = new StringTimes();

        System.out.println(st.stringTimes("Hi", 2)); // HiHi
        System.out.println(st.stringTimes("Hi", 3)); // HiHiHi
        System.out.println(st.stringTimes("Hi", 1)); // Hi
        System.out.println(st.stringTimes("Ha", 4)); // HaHaHaHa
        System.out.println(st.stringTimes("", 5));   // (empty string)
    }
}

