public class Main {
    public static void main(String[] args) {


        // 1. Напишите функциональность, которая вычисляет площадь круга
        double pi = 3.14;
        double r = 3;
        System.out.println("1. S=" + pi*r*r);

        // 2. Переведите температуру в градусах Цельсия в Фаренгейты
        double t = 36.6;
        System.out.println("2. T(F)=" + (t * 9/5 + 32) );

        // 3. Проверьте, является ли длина строки "Hello" равной длине другой строки
        String s1 = "Hello";
        String s2 = "Привет";
        String result =  (s1.length() == s2.length()) ? "Да" : "Нет";
        System.out.println("3. Длина строки Hello равна " + s2 +"? " + result);

        // 4. Напишите функциональность, которая определяет, является ли год високосным
        int year = 2025;
        result = ((year % 4 == 0) && (year % 100 != 0)) ? "Да" : "Нет";
        System.out.println("4. Год " + year + " високосный? " + result);

        // 5. Напишите калькулятор ИМТ
        double height = 1.90;  // в метрах
        double weight = 95;    // в кг
        System.out.println("5. ИМТ = " + weight / (height * height));

        // 6. Выведите в консоль таблицу истинности для операторов && и ||
        boolean a = true;
        boolean b = true;
        System.out.println("6. ");
        System.out.println("a     b      &&      || ");
        // System.out.println(a + "  " + b + "   " + (a && b) + "   " + (a || b));
        System.out.println("true  true   true    true");
        System.out.println("true  false  false   true");
        System.out.println("false true   false   true ");
        System.out.println("false false  false   false ");

        // 7. Выведите в консоль квадрат
        System.out.println("7. квадрат");
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }

        // 8. Выведите в консоль полый квадрат
        System.out.println("8. полый квадрат");
        System.out.println("  .");
        System.out.println("----");
        System.out.println("|  |");
        System.out.println("|  |");
        System.out.println("----");

        // 9. Выведите в консоль ромб
        System.out.println("9. ромб");
        System.out.println(" / \\"); // или char back = '\'
        System.out.println("<   >");
        System.out.println(" \\ /");
        System.out.println("  .");

        // 10. Выведите в консоль смайлик
        System.out.println("10. смайлик");
        System.out.println(";-)");

        System.out.println("--// if-else");

        //if-else
        //1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
        int d = 25;
        //result = (d % 2 == 0) ? "Да" : "Нет";
        if (d % 2 == 0) {
            System.out.println(d + " четное");
        }
        else {
            System.out.println(d + " нечетное");
        }
        //2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
        int a1 = 25;
        int a2 = 25;
        if (a1 > a2) {
            System.out.println("Первое больше");
        }
        else if (a1 < a2) {
            System.out.println("Второе больше");
        }
        else {
            System.out.println("Равны");
        }

        //3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
        a1 = 25;
        if (a1 > 0) {
            System.out.println("Положительное");
        }
        else if (a1 < 0) {
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Равно нулю");
        }

        //4. Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен
        a1 = 35;
        if (a1 >= 18) {
            System.out.println("Доступ разрешен");
        }
        else {
            System.out.println("Доступ запрещен");
        }
        //5. Придумать задачу самим
        String day = "Воскресенье";
        double temp = 25.5;
        if (day.equals("Воскресенье") && (temp > 25)) {
            System.out.println("Хороший день");
        }

        System.out.println("--// Тернарный оператор");
        //1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
        a1 = 0;
        result = (a1 > 0) ? "Positive" :
                (a1 < 0) ? "Negative" : "a = 0";
        System.out.println(result);

        //2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
        a1 = 45;
        result = ((a1 % 3*5) == 0) ? "Кратно" : "Не кратно";
        // result = ( ((a1 % 3) == 0) && ((a1 % 5) == 0))  ? "Кратно" : "Не кратно";
        System.out.println(result);

        //3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
        a1 = -6;
        result = ((a1 % 2) == 0) ? "Четное" : "Нечетное";
        System.out.println(result);

        System.out.println("--// switch");
        //1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
        d = 5;
        switch (d) {
            case 1:
                System.out.println("Пн");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
                System.out.println("Сб");
                break;
            case 7:
                System.out.println("Вскр");
                break;
            default:
                System.out.println("Ошибка");
        } ;

        //2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
        d = 6;
        switch (d) {
            case 1:
                System.out.println("...");
                break;
            case 2:
                System.out.println("Ну что ж.");
                break;
            case 3:
                System.out.println("Старался");
                break;
            case 4:
                System.out.println("Старался чуть больше");
                break;
            case 5:
                System.out.println("Мог бы и лучше");
                break;
            default:
                System.out.println("Нет слов...");
        } ;

        System.out.println("--// for");
        //1. Дан список чисел. Посчитайте сумму всех четных элементов
        int res  = 0;
        int[] nums = { 1, 2, 3, 5 };
        for (int i = 0; i < nums.length; i++){
            // Что считать четным - позицию или индекс?
            if (i % 2 == 0) {
                res = res + nums[i];
            }
        }
        System.out.println("по индексу: " + res);

        res  = 0;
        for (int i = 1; i < nums.length; i++){
            // Что считать четным - позицию или индекс?
            if (i % 2 != 0) {
                res = res + nums[i];
            }
        }
        System.out.println("по позиции: " + res);

        //2. Дан список чисел. Найдите максимальное значение
        int[] array = new int[] { 10, 20, 30, -40, 50 };
        res  = array[0];
        for (int i = 1; i < array.length; i++){
            if (res < array[i]) {
                res = array[i];
            }
        }
        System.out.println("max = " +res);

        //3. Дано число n. Выведите таблицу умножения для n от 1 до 10
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n*i));
        }

        //4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //5. Найдите количество четных чисел в диапазоне от 1 до 50
        res = 0;
        for (int i = 1; i <= 50; i++) {
            if ( (i % 2) == 0 ) {
                res++;
            }
        }
        System.out.println("количество четных чисел в диапазоне от 1 до 50 = " + res);

        System.out.println("--// while");
        //1. Найдите наименьшее число больше 100, которое делится на 7
        n = 100;
        boolean isFound =  false;
        while (!isFound) {
            n++;
            isFound = (n % 7 == 0);
        }
        System.out.println(n);

        //2. Дано число n. Вычислите его факториал через цикл while
        n = 1;
        res = 1;
        while (n <= 5) {
            res = res * n;
            n++;
        }
        System.out.println(res);

        //3. Дано число. Определите, является ли оно простым
        isFound = false;
        n = 2;
        a1 = 53;
        while (n <=  Math.sqrt(a1)) {
            isFound = (a1 % n == 0);
            if ( isFound ) {
                break;
            }
            n++;
        }
        if (isFound) {
            System.out.println(a1 + " не простое");
        }
        else {
            System.out.println(a1 + " - простое");
        }

        //4. Придумать задачу самим
        // найти 2 минимальных числа в списке из 2 и более элементов
        int j = 2;
        int[] arr = new int[] { 10, 20, -40, -40, 50, 0, 55, -30 };
        if (arr[0] > arr[1]) {
            a1 = arr[1];
            a2 = arr[0];
        }
        else {
            a1 = arr[0];
            a2 = arr[1];
        }
        while (j < arr.length){
            System.out.println("arr[" + j + "] = " +arr[j]);
            if ( (arr[j] <= a1)  ){
                a2 = a1;
                a1 = arr[j];
            }
            else if (arr[j] <= a2) {
                a2 = arr[j];
            }
            j++;
        }
        System.out.println(a1 + " и " + a2);

        System.out.println("--// break & continue");
        //1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
        for (int i = 1; i <= 20; i++) {
            if ( (i % 3) == 0 ) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println(" ");

        //2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
        int[] array2 = new int[] { 10, 20, 30, -40, 50 };
        res  = 0;
        for (int i = 0; i < array2.length; i++){
            if (array2[i] < 0) {
                break;
            }
            res = res + array2[i];
        }
        System.out.println(res);

        //3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
        int[] array3 = new int[] { 10, 20, 30, 40, 50, 60 };
        res  = 0;
        for (int i = 0; i < array3.length; i++){
            res = res + array3[i];
            if (res > 100) {
                break;
            }

        }
        System.out.println(res);


    }
}

