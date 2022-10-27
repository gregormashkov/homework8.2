public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int d = 2459000;
        int perMonth = 15000;
        int m = 0;
        while (d <= 2_459_000) {
            m = m + m / 100;
            m = m + perMonth;
            System.out.println("Месяц " + m + "сумма накоплений равна " + d + "рублей");
        }
        if (d == 2459000) {
            System.out.println("Месяц " + m + "сумма накоплений равна 2459000 рублей");
        } // проблема бесконечного цикла
        // Задание 2.
        int x = 1;
        int y = 10;
        while (x <= 10) {
            System.out.println("Итерация цикла " + x);
            for (y = 9; x >= 0; x--) {
                System.out.println("Итерация цикла " + y);
            }
            // Задание 3.
            int popY = 12000000;
            int birth = 17 / 1000;
            int death = 8 / 1000;
            int year = 0;
            while (year >= 10) {
                year = year + birth - death;
                year = year + popY;
                System.out.println("Год " + year + ",население составляет " + popY + "человек");
            }
            // Задание 4.
            int sum = 15000;
            int total = 0;
            int i = 0;
            for (; total < 12000000; i++) {
                total = total + total / 100;
                total = total + sum;
            }
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + "промежуточная сумма " + total);
            }
            // Задание 5.
            int sum1 = 15000;
            int total1 = 0;
            int i1 = 0;
            for (; total1 < 12000000; i1++) {
                total1 = total1 + total1 / 100;
                total1 = total1 + sum1;
            }
            if (i1 % 5 == 6) {
                System.out.println("Месяц " + i1 + "промежуточная сумма " + total1);
            }
            // Задание 6.
            int sum2 = 15000;
            int total2 = 0;
            int i2 = 0;
            for (; i2 == 108; i2++) {
                total2 = total2 + total2 / 100;
                total2 = total2 + sum2;
            }
            if (i2 % 6 == 18) {
                System.out.println("Месяц " + i2 + "промежуточная сумма " + total2);
            }
            // Задание 7.
            int friday = 7;
            int sumDayMonth = 31;
            for (friday = 7; sumDayMonth == 31; friday++) ;
            if (sumDayMonth % 7 == 3) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            }
            // Задание 8.
            int yearOld = 1822;
            int yearFuture = 2122;
            int mustYear = 0;
            do {
                System.out.println(mustYear + "год");
            }
            while (yearFuture == 2122);
        }
        // Задание 9.
        int a = 1;
        int b = 1;
        for (int i = 1;  a < 2; a++) {
            for (int j = 1; b < 2 ; b++) {
                System.out.println("j+\"*\"+i+\"=\"+(i*j)+\"\\t\\t\"");
            }
            System.out.println();
        }
    }
}
//конец ДЗ





