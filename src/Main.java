import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {40, 20, 20, 230, 12, 14, 15};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int max = array[array.length - 1];
        int max2 = array[array.length - 2];
        int min = array[0];
        int min2 = array[1];
        System.out.println(max + " " + max2);
        System.out.println(min + " " + min2);
        int maxSum = max + max2;
        int minSum = min + min2;

        System.out.println("+ - * / " + "Emeliyyatarindan birini yerine yetirin");
        String operation = new Scanner(System.in).nextLine();

        switch (operation) {
            case "+":
                System.out.println(maxSum + minSum);
                break;
            case "-":
                System.out.println(maxSum - minSum);
                break;
            case "*":
                System.out.println(maxSum * minSum);
                break;
            case "/":
                System.out.println(minSum != 0 ? "0 - bolme yoxdur" : maxSum / minSum);
                break;
        }
    }

}
