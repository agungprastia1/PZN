package shape;

public class Rectangle extends Shape {
    public int getCorner() {
        return 4;
    }

    public int getCornerParent() {
        return super.getCorner();
    }
}
