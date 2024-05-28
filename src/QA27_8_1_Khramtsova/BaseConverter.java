package QA27_8_1_Khramtsova;

class BaseConverter {
    public static double convert(double temperature, TemperatureUnit sourceUnit, TemperatureUnit targetUnit) {
        if (sourceUnit == targetUnit) {
            return temperature; // Если единицы измерения одинаковы, возвращаем исходное значение
        }

        switch (sourceUnit) {
            case CELSIUS:
                return convertFromCelsius(temperature, targetUnit);
            case KELVIN:
                return convertToCelsius(temperature, targetUnit);
            case FAHRENHEIT:
                return convertToFahrenheit(temperature, targetUnit);
            default:
                throw new IllegalArgumentException("Unsupported temperature unit: " + sourceUnit);
        }
    }

    private static double convertFromCelsius(double temperature, TemperatureUnit targetUnit) {
        switch (targetUnit) {
            case KELVIN:
                return temperature + 273.15;
            case FAHRENHEIT:
                return 1.8 * temperature + 32;
            default:
                throw new IllegalArgumentException("Unsupported target temperature unit: " + targetUnit);
        }
    }

    private static double convertToCelsius(double temperature, TemperatureUnit sourceUnit) {
        switch (sourceUnit) {
            case KELVIN:
                return temperature - 273.15;
            case FAHRENHEIT:
                return (temperature - 32) / 1.8;
            default:
                throw new IllegalArgumentException("Unsupported source temperature unit: " + sourceUnit);
        }
    }

    private static double convertToFahrenheit(double temperature, TemperatureUnit targetUnit) {
        switch (targetUnit) {
            case CELSIUS:
                return (temperature - 32) / 1.8;
            case KELVIN:
                return (temperature - 32) / 1.8 + 273.15;
            default:
                throw new IllegalArgumentException("Unsupported target temperature unit: " + targetUnit);
        }
    }
}
