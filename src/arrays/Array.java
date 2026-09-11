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
}
