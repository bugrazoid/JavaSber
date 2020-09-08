public class Celsius {
    Celsius(float degrees)
    {
        value = degrees;
    }
    float value;

    public Kalvin toKalvin()
    {
        return new Kalvin(value + 273);
    }

    public Fahrenheit toFahrenheit()
    {
        return new Fahrenheit((value * 9 / 5) + 32);
    }
}
