public class Main {
    public static void main(String[] args) {
        // 1. Add two integers a = 8 and b = 13 and print the result.
        int a = 8, b = 13;

        System.out.println(a + b);

        // 2. Calculate the area of a rectangle with double width = 5.5 and double height = 3.2. Print with message.
        double width = 5.5, height = 3.2;
        double area = width * height;

        System.out.println("Area: " + area);

        // 3. What is the result of System.out.println(5 + 3 * 2);? Explain why
        /*
            11 because the operator "*" has precedence greater than +,
            therefore, first it is multiplied then added
        */
        System.out.println(7 / 2);
        System.out.println(7 / 2.0);
        System.out.println((double) 7 / 2);
    }
}