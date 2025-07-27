public class HelloName {

    // Method to return a greeting of the form "Hello Name!"
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    // Main method for testing
    public static void main(String[] args) {
        HelloName hn = new HelloName();

        System.out.println(hn.helloName("Bob"));     // Hello Bob!
        System.out.println(hn.helloName("Alice"));   // Hello Alice!
        System.out.println(hn.helloName("X"));       // Hello X!
    }
}

