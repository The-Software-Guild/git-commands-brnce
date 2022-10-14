public class SummativeSums {
        public static void main(String[] args) {
            int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
            int[] array2 = { 999, -60, -77, 14, 160, 301 };
            int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                    140, 150, 160, 170, 180, 190, 200, -99 };

            // calls new method addArray inside the main method to print
            System.out.println("#1 Array Sum: " + addArrays(array1));
            System.out.println("#2 Array Sum: " + addArrays(array2));
            System.out.println("#3 Array Sum: " + addArrays(array3));

        }
        // method that adds an array of integers
        public static int addArrays(int[] array){

            // keep running total
            int j = 0;

            // starts at first index at 0, and loops till the last index
            for (int i =0; i < array.length; i++) {
                j += array[i];
            }
            return j;
        }

    }

