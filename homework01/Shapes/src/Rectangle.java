public class Rectangle extends AShape {
    int width;
    int height;
    @Override
    public float getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public float getArea() {
        return width*height;
    }
}
