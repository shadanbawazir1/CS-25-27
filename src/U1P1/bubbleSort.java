package U1P1;

public class bubbleSort {
    public static void bubbleSort(int[] arr){
        int[] numbers = (7,9,3,4,2);
        int temValue;

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temValue = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temValue;
                }
        }
    }
}
