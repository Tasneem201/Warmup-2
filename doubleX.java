public class DoubleX {

    // Method to check if the first "x" is followed by another "x"
    public boolean doubleX(String str) {
        int index = str.indexOf('x');

        // If there's no 'x' or it's the last character, it can't be followed by another
        if (index == -1 || index + 1 >= str.length()) {
            return false;
        }

        return str.charAt(index + 1) == 'x';
    }

    // Main method for testing
    public static void main(String[] args) {
        DoubleX dx = new DoubleX();

        System.out.println(dx.doubleX("axxbb"));    // true
        System.out.println(dx.doubleX("axaxax"));   // false
        System.out.println(dx.doubleX("xxxxx"));    // true
        System.out.println(dx.doubleX("abc"));      // false
        System.out.println(dx.doubleX("x"));        // false
    }
}
