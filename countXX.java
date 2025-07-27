public class CountXX {

    // Method to count overlapping "xx" pairs in the string
    public int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        CountXX obj = new CountXX();

        System.out.println(obj.countXX("abcxx"));   // 1
        System.out.println(obj.countXX("xxx"));     // 2
        System.out.println(obj.countXX("xxxx"));    // 3
        System.out.println(obj.countXX("x"));       // 0
        System.out.println(obj.countXX(""));        // 0
        System.out.println(obj.countXX("xaxxxb"));  // 2
    }
}

