import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите элементы массива через пробел\n");
        String numbers = sc.nextLine();
        String arr[] = numbers.split(" ");
        int numberArray [] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            numberArray[i] = Integer.parseInt(arr[i]);
            if (numberArray[i] % 3 == 0) {
                System.out.println(numberArray[i]);
            }
        }
    }
}
