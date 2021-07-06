package HW_5;


import java.util.Arrays;

public class AppData {
    private String headers;
    private int[][] data;

    public AppData(String headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }
    public String getHeaders() {
        return headers;
    }
    public void setHeaders(String header) {
        this.headers = headers;
    }
    public int[][] getData() {
        return data;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "AppData{" +
                "header='" + headers + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
