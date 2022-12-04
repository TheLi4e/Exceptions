package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2 {
// Задание 1.
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void checkIfUserNumberIsFloat() {
        while (true) {
            System.out.println("Введите дробное число:");
            Scanner sc = new Scanner(System.in);
            try {
                float userFloat = sc.nextFloat();
                System.out.println(userFloat);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введенное значение не является дробным числом, пожалуйста, повторите ввод:");
            }
        }
    }
/*Задание 2.
Если необходимо, исправьте данный код
try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
}
 */
    public static void divideArrayNums() {
        try {
            int d = 10;
            double[] intArray = {1, 3, 6, 2, 3, 5, 0, 5, 0};
            double catchedRes1 = intArray[8] / d;
            if (Double.isNaN(catchedRes1) | Double.isInfinite(catchedRes1)) {
                System.out.println("Catching exception: Division by zero");
            } else System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e.getLocalizedMessage());
        }
    }
/*Задание 3.
Если необходимо, исправьте данный код
public static void main(String[] args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
}
 */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }// исключение FileNotFoundException при данной операции невозможно

/*Задание 4.
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
    public static void printUserString() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.trim().isEmpty()) {
            throw new NullPointerException("Empty string is not allowed");
        } else System.out.printf("Entered string: %s", userInput);
    }
}
