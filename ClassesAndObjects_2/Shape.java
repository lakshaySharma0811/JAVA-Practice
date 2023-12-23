public class Shape {
    public int breadth;
    public int length;

    Shape(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    void getArea() {
        System.out.println(this.length * this.breadth);
    }

}

