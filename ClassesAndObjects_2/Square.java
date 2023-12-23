public class Square extends Shape {

    public Square(int side) {
        super(side, side);
    }

    void checkLength() {
        // this.length = 50;
        super.length = 40;
        System.out.println(this.length);
        System.out.println(super.length);
        return;
    }
}
