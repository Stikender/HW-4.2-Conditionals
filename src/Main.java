public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else  {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Exercise 2");

        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

        System.out.println("Exercise 3");

        int year = 2021;
        if (year % 4 ==0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");            }
            }
        if (year % 4 !=0) {
            if (year % 100 == 0 || year % 400 != 0) {
                System.out.println(year + " год не является високосным");
            }
        }
    }

}