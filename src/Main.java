//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * примитивные типы данных
         */
        int volume = 5;
        double price = 13.50;
        boolean inStock = true;
        char kind = 'P';

        /**
         * Ссылочные типы данных
         */
        String bookName = "Колобок";
        System.out.println(bookName.toUpperCase());

        /**
         * Операторы
         */
        // арифметические

         int a = 14;
         int b = 4;

         System.out.println(a + b); // сложение = 18
         System.out.println(a - b); // вычитание = 10
         System.out.println(a / b); // деление целочисленное = 3
         System.out.println(a % b); // остаток от деления = 2

         // логические
         boolean x = true;
         boolean y = false;

         System.out.println(x && y); // И = false
         System.out.println(x || y); // ИЛИ = true
         System.out.println(!y); // НЕ = true

         // сравнения
         System.out.println(a == b);
         System.out.println(a <= b);

         System.out.println(!(x && y) || (2 < 5)); // = true
         System.out.println((x || y) == true); // = true

        /**
         * Вывод в консоль
         */

        //System.out.print("\n");
        System.out.printf("В наличии %s, цена %s руб.\n",bookName, 100);
        System.out.printf("Скидка? %s\n", price < 100);

        /**
         * Комментарии
         */

        // Однострочный
        // еще строка

        /*
        много
        много
        строк
         */

        /**
         * Условные операторы: if, else, switch
         */

        boolean isGood = true;
        if (isGood) {
            System.out.println("Включи музыку");
            System.out.println("Танцуй");
        }
        else {
            System.out.println("Выключи свет");
            System.out.println("Ложись спать");
        }

        if (isGood) {
            System.out.println("Радуйся!");
        }

        String city = "Vasuki";
        if (city.equals("Paris")) {
            System.out.println("France");
        } else if (city.equals("Rome")) {
            System.out.println("Italy");
        } else {
            System.out.println("Unknown");
        }

        String day = "Воскресенье";
        double temp = 25.5;
        if (day.equals("Воскресенье") && (temp > 25)) {
            System.out.println("Выходной");
        }

        a = 0;
        String res = (a > 0) ? "Positive" :
                     (a < 0) ? "Negative" : "a = 0";
        System.out.println(res);

        switch (city) {
            case "Vasuki":
                System.out.println("New Mosсow");
                break;
            case "Paris":
                System.out.println("France");
                break;
            case "Rome":
                System.out.println("Italy");
                break;
            default:
                System.out.println("...");
        } ;

        /**
         * циклы
         */

        // for
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // while
        int k = 0;
        while (k < 7) {
            //System.out.println("k = " + k);
            k++;
        }

        /**
         * Ключевые слова break и continue
         */
        for (int i = 1; i <= 10; i++) {
            if (i > 3) {
                break; // выход из цикла
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                continue; // пропуск
            }
        }

    }
}