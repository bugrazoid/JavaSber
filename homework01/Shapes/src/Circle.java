public class Circle extends AShape {
    int r;

    @Override
    public float getPerimeter() {
        return (float) (2*Math.PI*r);
    }

    @Override
    public float getArea() {
        return (float) (Math.PI*r*r);
    }
}
