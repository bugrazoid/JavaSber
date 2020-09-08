public class Fahrenheit {
    Fahrenheit(float degrees)
    {
        value = degrees;
    }
    float value;

    Celsius toCelsius()
    {
        return new Celsius((value-32)*5/9);
    }

    Kalvin toKalvin()
    {
        return new Kalvin(((value-32)*5/9)+273);
    }
}
