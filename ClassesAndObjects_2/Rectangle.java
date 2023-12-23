public class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void checkLength() {
        System.out.println(this.length);
        System.out.println(super.length);
    }
}
