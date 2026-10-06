public class Operator {
    public static void main(String[] args) {
        int x;
        x = 7 + 5;
        x += 10;
        System.out.println("value of x is: " + x);
        x -= 5;
        System.out.println("value of x is: " + x);
        x *= 2;
        System.out.println("value of x is: " + x);
        x /= 3;
        System.out.println("value of x is: " + x);

        // trying increment and decrement operator
        int a;
        a = 5; // pre & post increment
        System.out.println("Current value of a is: " + a++);
         System.out.println("Current value of a is: " + ++a);

          a = 5;
        System.out.println("Current value of a is: " + ++a);
         System.out.println("Current value of a is: " + a++);

         a = 5; // pre & post decrement 
         System.out.println("Current value of a is: " + a--);
         System.out.println("Current value of a is: " + --a);

         // now precedence & associativity of operators
            int b = 5 + 3 * 2; // precedence of * is higher than +
            System.out.println("value of b is: " + b);
            int c = (5 + 3) * 2; // precedence of () is higher than *
            System.out.println("value of c is: " + c);
    }
}