
public class Operators {
    public static void main(String[] args) {
        // Operators - It is a way to tell the compiler to do the operations between the operands.

        // 1. Arithmetic operators

        // Binary operators (for 2 operands)
        // +, -, *, /, %
        // int a = 10;
        // int b = 5;
        // System.out.println("Sum: " + (a + b));
        // System.out.println("Difference: " + (a - b));
        // System.out.println("Product: " + (a * b));
        // System.out.println("Quotient: " + (a / b));
        // System.out.println("Remainder: " + (a % b));

        // Unary operators (for 1 operand)
        // Pre increment (++a), Pre decrement (--a), Post increment(a++), Post
        // decrement(a--)
        // int a = 5;
        // System.out.println(a++); // First assign the value then increase
        // System.out.println(++a); // First increase then assign the value
        // System.out.println(a--); // First assign the value then decrease
        // System.out.println(--a); // First decrease then assign the value

        
        // 2. Assignment operators
        // =, +=, -=, *=, /=, %=
        // a = b // b is going in a
        // a += b -> a = a + b
        // a -= b -> a = a - b
        // a *= b -> a = a * b
        // a /= b -> a = a / b
        // a %= b -> a = a % b


        // 3. Relational operators (always return boolean value)
        // ==, =!, >=, <=, >, <
        // int a = 10, b = 20;
        // System.out.println(a == b); // False
        // System.out.println(a != b); // True
        // System.out.println(a > b); // False
        // System.out.println(a < b); // True
        // System.out.println(a >= b); // False
        // System.out.println(a <= b); // True  

        
        // 4. Logical operators (always return a boolean value)
        // AND(&&), OR(||), NOT(!)
        // AND -> true if both the expressions are true.
        // OR -> true if either of the expressions is true.
        // NOT -> true if expression is false and vice versa.

        // int a = 10, b = 20, c = 30;
        // System.out.println(((a > b) && (b > c)) || !(a == c));
        // Precedence order -> NOT > AND > OR

    }
}
