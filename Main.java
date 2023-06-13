package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputFloat();
    }

    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа (типа float)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Ввод текта запрещается");
            }
            scanner.close();
        }
    }
    public static void task1() {
        try {
            int[] intArray = new int[]{};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e ) {
            System.out.println("Arithmetic excaption" + e);
         } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds of array: " + e);
         }
         
    }
        
       
       
       
       

        
    }

