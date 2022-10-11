public class operators {
    public static void main(String[] args) {
        int result;
        int num1;
        int num2;
        int num3;

        result = 0; // result has the value of 0

        num1 = 22;
        num2 = 30;

        num3 = num2; // both have the value 30

        // Addition

        result = 2 + 5; // result is now 7

        result = num1 + num2; // result now equal 52

        result = 1 + num1; // result now equals 23

        result = 4 + num1 + num2 + num3;

        result = 6; // now result has the value 2
        result += 3; // result is now equal to 9 (6 + 3)
        result += num1; // result now equal to 31 (9 + 22)

        // Subtraction

        result = 4 - 3; //result is now 1

        result = num1 - num2; // result now equal -8

        result = 50 - num1; // result now equals 28

        result = 17 - num1 - num2 - num3; // result now equal -35

        result = 4; // set result to 4
        result -= 8; // result is now equal to -4 (4 - 8)
        result -= num1; // result is now equal to -26 (-4 - 22)


        // Multiplication

        result = 5 * 3; // result is now 15

        result = num1 * num2; // result now equals 660

        result = 3 * num1; // result now equals 66

        result = 2 * num1 * num2 * num3; // result is now equal to 39600

        result = 2; // set result to 2
        result *= 4; // result now equal to 8 (2 * 4)
        result *= num1; // result is now equal to 176

        // Division and Modulus

        result = 6 / 3; // result now equals 2

        result = num1 / num2; // result now equals 0

        result = num1 % num2; // result now equals 22


        result = 44 / num1; // result now equals 2

        result = 245 / num1 / num2 / num3; // result now equals 0

        result = 6; // set result to 20
        result /= 3; // result is now equal to  2 (6 / 3)
        result /= num1; // result is now equal to 0 (2 / 22)

    }
}
