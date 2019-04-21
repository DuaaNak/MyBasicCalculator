import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("This is a basic calculator \nTo start please enter 0\nto exit click 9");
        int repeat = Input.nextInt();

        while (repeat == 0) {

            System.out.println("Please choose the operation needed");
            System.out.println(" for + please enter 1 \n for - please enter 2 \n for * please enter 3 \n for / please enter 4");

            int operation = Input.nextInt();

            if (operation == 1){
                System.out.println("Please add your first Number");
                int FirstNum = Input.nextInt();

                System.out.println("Please add your second Number");
                int SecondNum = Input.nextInt();

                int sum = FirstNum + SecondNum;
                System.out.println("The Sum is: "+ sum);

                System.out.println("to continue please enter 0 \nto exit please enter 9");
                int Choice = Input.nextInt();

                if (Choice == 0) {
                    repeat = 0;
                } else if (Choice == 9) {
                    repeat = 9;
                }


            } else if (operation == 2) {
                System.out.println("Please add your first Number");
                int FirstNum = Input.nextInt();

                System.out.println("Please add your second Number");
                int SecondNum = Input.nextInt();

                int diff = FirstNum - SecondNum;
                System.out.println("The Difference is: "+ diff);

                System.out.println("to continue please enter 0 \nto exit please enter 9");
                int Choice = Input.nextInt();

                if (Choice == 0) {
                    repeat = 0;
                } else if (Choice == 9) {
                    repeat = 9;
                }

            } else if (operation == 3) {
                System.out.println("Please add your first Number");
                int FirstNum = Input.nextInt();

                System.out.println("Please add your second Number");
                int SecondNum = Input.nextInt();

                int Product = FirstNum * SecondNum;
                System.out.println("The Product is: "+ Product);

                System.out.println("to continue please enter 0 \nto exit please enter 9");
                int Choice = Input.nextInt();

                if (Choice == 0) {
                    repeat = 0;
                } else if (Choice == 9) {
                    repeat = 9;
                }
            } else if (operation== 4) {
                System.out.println("Please add your first Number");
                int FirstNum = Input.nextInt();

                System.out.println("Please add your second Number");
                int SecondNum = Input.nextInt();

                int Qout = FirstNum / SecondNum;
                System.out.println("The Quotient is: "+ Qout);

                System.out.println("to continue please enter 0 \nto exit please enter 9");
                int Choice = Input.nextInt();

                if (Choice == 0) {
                    repeat = 0;
                } else if (Choice == 9) {
                    repeat = 9;
                }
            } else {
                System.out.println("Please choose one of the operation");

            }
            System.out.println("Thank you for using our calculator");
        }
    }
}
