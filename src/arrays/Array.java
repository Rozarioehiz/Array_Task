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

    public int[] largestNumber(int[] numbers) {
        int largest = numbers[0];
        for(int count = 1; count < numbers.length; count++){
            if(numbers[count] > largest){
                largest = numbers[count];
            }
        }
        int [] result = {largest};
        return  result;
    }

    public int countOccurance(int[] numbers, int target) {
        int counter = 0;
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] == target){
                counter++;
            }
        }

        return counter;
    }


    public boolean elementContainter(int [] numbers, int target) {
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] == target){
                return true;
            }
        }
        return false;
    }
}



