public class Kalvin {
    Kalvin(float degrees)
    {
        value = degrees;
    }
    float value;

    public Celsius toCelsius()
    {
        return new Celsius(value - 273);
    }

    public Fahrenheit toFahrenheit()
    {
        return new Fahrenheit((value - 273)*9/5 + 32);
    }
}
