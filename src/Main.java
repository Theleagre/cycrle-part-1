public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++)
            System.out.println("от 0 до 10 " + i);
        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i--)
            System.out.println("от 10 до 0 " + i);
        //Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i++)
            if (i % 2 == 0)
            System.out.println("четные от 0 до 17 " + i);
        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--)
            System.out.println("по уменьшению от 10 до -10 " + i);
        //Задача с високосным годом
        System.out.println("Задача с високосным годом");
        for (int i = 2020; i <= 2070; i = i + 4)
            System.out.println("високосный год " + i);

        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1906; i <= 2096; i = i + 4)
            System.out.println(i + " год является високосным");
        //Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println("последовательность " + i);
        //Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println("последовательность * " + i);

        //Пример с вычислениями
        System.out.println("Пример с вычислениями");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println ("Месяц + " + i + " Итого " + total);
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");
        int fee = 29000;
        int all = 0;
        for (int I = 1; I <= 12; I++) {
            all = all + fee;
            System.out.println("Месяц " + I + " сумма накоплений равна " + all + " рублей");
        }
        //Задание 2
        System.out.println("Задание2");
        int fee1 = 29000;
        int all1 = 0;
        for (int I = 1; I <= 12; I++) {
            all1 =all1 + all1 / 100;
            all1 = all1 + fee1;
            System.out.println("Месяц " + I + " сумма накоплений равна " + all1 + " рублей");
        }

}
}