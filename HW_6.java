package HW_6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.io.IOException;
import okhttp3.Response;

public class HW_6 {
    private static final String BAZE_HOST = "api.weather.yandex.ru";
    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    private static final String SAINT_PETERSBURG_KEY = "295212_PC";
    private static final String API_KEY = "66e4cef6-7718-465e-8df7-104ff639b0bb";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BAZE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(SAINT_PETERSBURG_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
    }

}
