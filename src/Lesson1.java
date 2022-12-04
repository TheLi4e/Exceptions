package src;

public class Lesson1 {
    static int getArithmeticExeption() {
        int a = 10;
        int b = 0;
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.fillInStackTrace());
        }
        return result;
    }
    static void getNullPointerException(){
        String str =  null;
        try{
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    static void getIndexOfBoundException(){
        int[] arr = new int[5];
        try{
            System.out.println(arr[7]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    static int[] getSumm(int[] a, int[] b){
        int[] result = new int[a.length];
        if(a.length > b.length || b.length > a.length){
            throw new RuntimeException("Длины массивов не равны, суммирование невозможно");
        }
        for(int i = 0; i < a.length; i++){
            result[i] = a[i] - b[i];
        }
        return result;
    }
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    // каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
    // не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    // которое пользователь может увидеть - RuntimeException, т.е. ваше.
    static int[] getParticular(int[] a, int[] b){
        int[] result = new int[a.length];
        if(a.length > b.length || b.length > a.length){
            throw new RuntimeException("Длины массивов не равны, суммирование невозможно");
        }
        for(int i = 0; i < a.length; i++){
            if(b[i] == 0){
                throw new RuntimeException("b = " +b[i] + " Деление на ноль невозможно");
            }
            result[i] = a[i] / b[i];
        }
        return result;
    }
}
