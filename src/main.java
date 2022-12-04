package src;

public class main {
    public static void main(String[] args) {
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        Lesson1.getArithmeticExeption();
        Lesson1.getNullPointerException();
        Lesson1.getIndexOfBoundException();
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
        int[] a = {1, 4, 2, 5, 7};
        int[] b = {3, 11, 4, 5, 5};
        try {
            for (int i : Lesson1.getSumm(a, b)) {
                System.out.println(i);
            }

        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println();
        try {
            for (int i : Lesson1.getParticular(a, b)) {
                System.out.println(i);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
