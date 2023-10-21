package HW5;

public class hw4myRectangle {
	private double width;
    private double depth;

    public hw4myRectangle() {
    }

    public hw4myRectangle(double width, double depth) {
        setWidth(width);
        setDepth(depth);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return width * depth;
    }
}
