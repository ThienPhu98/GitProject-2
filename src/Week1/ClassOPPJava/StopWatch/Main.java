package Week1.ClassOPPJava.StopWatch;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[100000];

        StopWatch watch = new StopWatch();
        watch.Start();

        randomArray(array);
        sortArray(array);

        System.out.print("Array is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        watch.End();
        System.out.print("\n Time spend to work is: " + watch.getElapsedTimeSecs() + " second");
    }


    public static int[] randomArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int temp = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
