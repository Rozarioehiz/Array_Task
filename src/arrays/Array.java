package arrays;

public class Array {
    public int [] smallestNumber(int[] numbers) {
        int smallest = numbers[0];
        for(int count = 1; count < numbers.length; count++){
            if(numbers[count] < smallest){
                smallest = numbers[count];
            }

        }
         int[] result = {smallest};
        return result;
    }

    public double[] averageNumbers(double[] numbers) {
     double sum = numbers[0];
     for(int count = 1; count < numbers.length; count++){
         sum = sum + numbers[count];
     }
     double average = sum / numbers.length;
     double [] result = {average};
     return result;
    }

}
