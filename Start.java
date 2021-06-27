package HW_2;

public class Start {
    public static void main(String[] args) {
        String[][] MyArray =  {
                {"1", "1", "1", "abc"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        for (int i = 0; i < MyArray.length; i++) {
            for (int j = 0; j < MyArray[i].length; j++) {
            }
            System.out.println(MyArray[i][i]);
        }
        System.out.println();
        try {
            try {
                int result = checkArrays (MyArray);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Несоответствующий размер массива");

                e.printStackTrace();
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Значения в массиве некорректны");
            System.out.println("Error in: " + e.i + "x" + e.j);
        }
    }
    private static int checkArrays (String[][] myMass) throws MyArraySizeException, MyArrayDataException {
        int max_number = 4;
        int sum = 0;
        if (myMass.length != max_number) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myMass.length; i++) {
            if (myMass[i].length != max_number) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < myMass[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(myMass[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
