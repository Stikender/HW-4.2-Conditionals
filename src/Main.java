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

        System.out.println("Exercise 4");

        int deliveryDistance = 20;
        int deliveriPeriod = 1;

        if (deliveryDistance % 20 ==0 && deliveriPeriod +1 ==0)  {
            System.out.println("Для доставки карты потребуется " + deliveriPeriod + " дней.");
            }


        System.out.println("Exercise 5");
        int monthNamber =12;

        switch (monthNamber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого времени года не существует.");
                }

    }

}