package HW5;

class hw4myRectangleMain {
	public static void main(String[] args) {
		hw4myRectangle rectangle1 = new hw4myRectangle();
        rectangle1.setWidth(10);
        rectangle1.setDepth(20);
        System.out.println(rectangle1.getArea());

        hw4myRectangle rectangle2 = new hw4myRectangle(10, 20);
        System.out.println(rectangle2.getArea());
    }
}
