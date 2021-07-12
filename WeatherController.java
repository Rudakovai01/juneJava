package HW_7;

public class WeatherController {
    private IWeatherProvider weatherProvider = new AccuWeatherProvider();


    public void onUserInput(int command) {
        switch (command) {
            case 1:
                getFiveDaysWeather();
                break;
        }
    }
    private void getFiveDaysWeather() {

        weatherProvider.getWeather(Period.FIVE_DAYS);
    }
}
