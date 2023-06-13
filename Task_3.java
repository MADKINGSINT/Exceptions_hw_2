package homework2;



public class Task_3 {
    public static void main(String[] args)  {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            try {
                abc[3] = 9;
            } catch (IndexOutOfBoundsException e) {
                // TODO: handle exception
                System.err.println("Index is out bounds of array");
            }
            
        
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
     }
     
}
