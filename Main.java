package HW_5;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main (String[] args) throws Exception {
//        ДЗ
//        Реализовать сохранение данных в csv файл;
//        Реализовать загрузку данных из csv файла. Файл читается целиком.
//                Структура csv файла:
//        Строка заголовок с набором столбцов
//        Набор строк с целочисленными значениями
//                * Разделитель между столбцами - символ точка с запятой (;)
//        Пример:
//        Value 1;Value 2;Value 3
//        100;200;123
//        300,400,500
//        Для хранения данных использовать класс вида:
//        public class AppData {
//            private String[] header;
//            private int[][] data;
//            // ...
//        }
//        Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.

        try (OutputStream out = new FileOutputStream("./appData.csv")){
            out.write("Value;1Value2;Value3\n100;200;123\n300;400;500".getBytes(StandardCharsets.UTF_8));
        }
        BufferedReader br = new BufferedReader(new FileReader("appData.csv"));
          String headers = br.readLine();
          if (headers !=null){
            String [] colums = headers.split(";");
            System.out.println(headers);
        }
        String data = br.readLine();
        if (data !=null){
            String[] col = data.split(";");
            System.out.println(data);
        }
        String data2 = br.readLine();
        if (data2 !=null){
            String[] col2 = data2.split(";");
            System.out.println(data2);
        }
    }
}
