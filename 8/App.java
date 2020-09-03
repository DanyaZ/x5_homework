public class App {
    public static void main(String [] args){

        int[] intArray = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        MaxNumber(intArray);
        SumPositiveNumber(intArray);
        SumNegativeNumber(intArray);
        CountPositiveNumber(intArray);
        AveragePositiveNumber(intArray);
    }

    private static void MaxNumber(int[] intArray) {
        int maxEl = intArray[0];
        for (int i:intArray) {
            if (i>maxEl) {
                maxEl = i;
            }
        }
        System.out.println(maxEl);
    }

    private static void SumPositiveNumber(int[] intArray) {
        int SumNumber= 0;
        for (int i:intArray) {
            if (i>0) {
                SumNumber += i;
            }
        }
        System.out.println(SumNumber);
    }

    private static void SumNegativeNumber(int[] intArray) {
        int SumNumber= 0;
        for (int i:intArray) {
            if ((i<0) && (i%2==0)) {
                SumNumber += i;
            }
        }
        System.out.println(SumNumber);
    }

    private static void CountPositiveNumber(int[] intArray) {
        int CountNumber= 0;
        for (int i:intArray) {
            if (i>0) {
                CountNumber++;
            }
        }
        System.out.println(CountNumber);
    }

    private static void AveragePositiveNumber(int[] intArray) {
        int SumNumber= 0;
        int CountNumber= 0;
        for (int i:intArray) {
            if (i<0) {
                CountNumber++;
                SumNumber += i;
            }
        }
        double Average = (SumNumber*1.0)/(CountNumber*1.0);
        System.out.println(Average);
    }
}
