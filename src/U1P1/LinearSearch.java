package U1P1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers ={3,9,7,4};
        int target = 7;
        int position = -1;
        int i = 0;

        while (position == -1){
            if(target == numbers[i]){
                position = i;
            }
        }
        if(position != -1){
            System.out.println("element found on position "+ position);
        }
        else{
            System.out.println("element not found");
        }

    }
}
