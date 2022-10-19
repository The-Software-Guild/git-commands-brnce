package com.sg.foundations.flowcontrol.arrays;

public class StillPositive {
    public static void main(String[] args) {
        int[] numbers = {389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};

        for(int n : getPositiveNumbers(numbers)){
            System.out.print(" " + n);
        }
    }
    public static int[] getPositiveNumbers(int[] numbers)
    {
        int count = 0;
        for (int n : numbers)
        {
            if(n>0)
            {
                count++;
            }
        }
        int [] nums = new int[count];
        int i =0;
        for (int n : numbers)
        {
            if(n>0)
            {
                nums[i] = n;
                i++;
            }
        }

        return nums;

    }

}




