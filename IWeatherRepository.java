package HW_8;

import java.util.List;

public interface IWeatherRepository {
    List<Weather> getAllData();

    void saveWeatherObject (Weather weather);

}
