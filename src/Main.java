public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int totalAccumulation = 2459000;
        int accumulation = 0;
        int month = 0;
        while (accumulation <= totalAccumulation){
            accumulation = accumulation + 15000;
            month++;
            System.out.println("Month " + month + ": the sum of accumulation is " + accumulation);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while(i<=10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >=1; j--){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int i = 1;
        int population = 12000000;
        int annualBirthRate = 12000000 / 1000 * 17;
        int annualDeathRate = 12000000 / 1000 * 8;
        while (i <= 10){
            population = population + annualBirthRate - annualDeathRate;
            System.out.println("Year " + i + ": population is " + population);
            i++;
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        double accumulation = 15000.0;
        int totalAccumulation = 12000000;
        int month = 0;
        while (accumulation <= totalAccumulation){
            month++;
            accumulation = accumulation + accumulation * 0.07;
            System.out.println("Month " + month + ": accumulation is " + accumulation);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double accumulation = 15000;
        int totalAccumulation = 12000000;
        int month = 0;
        while (accumulation <= totalAccumulation){
            month++;
            accumulation = accumulation + accumulation * 0.07;
            if (month % 6 == 0) {
                System.out.println("Month " + month + ": accumulation is " + accumulation);
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int years = 9;
        double accumulation = 15000.0;
        double year = 0.5;
        while (year <= years){
            accumulation = accumulation + accumulation * 0.035;
            System.out.println("Year " + year + ": accumulation is " + accumulation);
            year = year + 0.5;
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 3;
        int days = 31;
        for (int i = firstFriday; i <= days; i = i + 7){
            System.out.println("Today is Friday " + i + "th. Please prepare a report");
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int year200Before = currentYear - 200;
        int year100After = currentYear + 100;
        for (int i=0; i <= year100After; i = i+79){
            if (i >= year200Before){
                System.out.println(i);
            }
        }

    }
}