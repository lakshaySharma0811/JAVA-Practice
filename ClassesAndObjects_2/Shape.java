public class Shape {
    private int breadth;
    private int length;

    Shape(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    void getArea() {
        System.out.println(this.length * this.breadth);
    }

}
