public class Triangle extends AShape {
    int a;
    int b;
    int alpha;

    @Override
    public float getPerimeter() {
        return (float) (Math.sqrt(a*a + b*b - 2*a*b*Math.cos(alpha)) + a + b);
    }

    @Override
    public float getArea() {
        return (float) (0.5f * a * b * Math.sin(alpha));
    }
}
