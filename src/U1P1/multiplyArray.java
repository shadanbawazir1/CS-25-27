package U1P1;

public class multiplyArray {
    public static void main(String[] args) {

        int firstArray[] = new int[5];
        int secondArray[]= new int[5];
        int resultArray[] = new int [5];

        //multiply fistArray and secondArray
        //put the product in resultArray

        firstArray[0] = 7;
        firstArray[1] = 8;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 3;

        secondArray[0] = 30;
        secondArray[1] = 46;
        secondArray[2] = 28;
        secondArray[3] = 43;
        secondArray[4] = 25;

        int sumArray = 0;
        for (int i = 0; i < 5; i++) {
            resultArray[i] = firstArray[i] * secondArray[i];
            System.out.println(resultArray[i]);
        }

        for(int i=0; i<resultArray.length; i++) {

        // Total sum of purchases
        sumArray = sumArray + resultArray[i];

        }
        System.out.println("The sum of your purchase is $"+sumArray);

    }
}
