package ExtraWork.UnitConversions;

public class UnitConversion {

    public static double celsiusToFahrenheit(double celsiusTemp){
        return (celsiusTemp * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemp){
        return (fahrenheitTemp - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsiusTemp){
        return celsiusTemp + 273.15;
    }

    public static double kelvinToCelsius(double kelvinTemp){
        return kelvinTemp - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheitTemp){
        return (fahrenheitTemp - 32) * (5.0/9) + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvinTemp){
        return (kelvinTemp - 273.15) * (9.0/5) + 32;
    }



    public static void main(String[] args) {

        System.out.println(celsiusToFahrenheit(50));
        System.out.println(fahrenheitToCelsius(70));

        System.out.println(fahrenheitToKelvin(100));
        System.out.println(kelvinToFahrenheit(100));
    }
}
