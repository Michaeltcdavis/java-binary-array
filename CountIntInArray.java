public class CountIntInArray {

    // Define a result class which contains the related information
    // in a descriptive way
    final static class IntResult {
        private final int count;
        private final int value;

        public IntResult(int count, int value) {
            this.count = count;
            this.value = value;
        }

        public int getCount() {
            return count;
        }

        public int getValue() {
            return value;
        }
    }

    //Helper function to find the count and value of the non-zero int in an array
    private static IntResult countIntInArray(Integer[] intArray) {

        int size = intArray.length;
        int intValue = 0;
        int nonZeroIndex = 0;

        //find the non-zero value and break the loop with the information
        for (int i = 0; i < size; i++) {

            if (intArray[i] != 0) {
                intValue = intArray[i];
                nonZeroIndex = i;
                break;
            }
        }

        // continue the loop from where the previous loop left off, 
        // and taking the sum of the remaining values
        int intTotal = intValue;
        for (int j = nonZeroIndex + 1; j < size; j++) {
            intTotal += intArray[j];
        }

        // Return a result class containing the information in a descriptive way
        // Find intCount by dividing the sum by the value
        return new IntResult(intTotal / intValue, intValue);
    }

    public static void main(String args[]) {
        Integer[] exampleInt = { 3, 3, 3, 3, 0, 3};

        IntResult exampleArrayInt = countIntInArray(exampleInt);

        System.out.println("The non-zero value in the array is " + exampleArrayInt.getValue());
        System.out.println("The non-zero value is repeated " + exampleArrayInt.getCount() + " times");
    }
}