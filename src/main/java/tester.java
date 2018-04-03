public class tester {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }


        /* arr.length returns the number of elements
         * present in the array
         */
        double average = sum / numbers.length;

        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.format("The average is: %.3f", average);
    }
}