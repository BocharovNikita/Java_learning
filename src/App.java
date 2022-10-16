//Импорт библиотеки для работы с вводом
import java.util.Scanner;

public class App {
    // Однострочный комментарий

    /*
        Многострочный комментарий
    */
    public static void main(String[] args) {

        //Вывод в консоль
        //System.out.println("Hello world!");

        /*  Ввод в библиотеку
            Scanner input = new
            (System.in);
            int age = input.nextInt();
        */


        /*  ЗАДАЧА 1
            <, >, ==, <=, >=.
            Если меньше или равен 18 -> молодой
            Если меньше 65 и больше 18 -> взрослый
            Если больше или равен 65 то -> пенсионер
        */

        System.out.println("Введите возраст: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age <= 18) {
            System.out.println("Молодой");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }


        System.out.println("Введите 1 ЦЕЛОЕ число: ");
        int a = input.nextInt();

        System.out.println("Введите 2 ЦЕЛОЕ число: ");
        int b = input.nextInt();

        if (a == b) {
            System.out.println("Они равны");
        }else if (a > b) {
            System.out.println("Первое число больше второго");
        }else {
            System.out.println("Первое число меньше второго");
        }
    }
}