public class Main {
    public static void main(String[] args) {
        // ДЗ 1/задание 1
        System.out.println(" ДЗ 1/задание 1");
        int monthNumber = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 15_000;
            System.out.printf(" Месяц %s , сумма накоплений равна %d  рублей \n", monthNumber, sum);
            monthNumber++;
        }
        // ДЗ 1/задание 2
        System.out.println(" ДЗ 1/задание 2");
        int num = 1;
        while (num <= 10) {
            if (num == 10) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
            num++;
        }
        for (; num >= 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
        }
        // ДЗ 1/задание 3
        System.out.println(" ДЗ 1/задание 3");
        int population = 12_000_000;
        int birtRate = 17 * population / 1000;
        int deadRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population += birtRate;
            population -= deadRate;
            System.out.printf("Год %d , численность %d   \n", i, population);
        }

        // ДЗ 2/задание 1
        System.out.println("ДЗ 2/ задание 1");
        int sum1 = 15000;
        int montNum = 1;
        while (sum1 <= 12_000_000) {
            sum1 *= 1.07;
            System.out.printf(" Месяц %d , сумма %d  \n", montNum, sum1);
            montNum++;
        }
        // ДЗ 2/задание 2
        System.out.println(" ДЗ 2/задание 2");
        int sum2 = 15000;
        int monthNum = 1;
        while (sum2 <= 12_000_000) {
            sum2 *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.printf(" Месяц %d , сумма %d  \n", montNum, sum2);
            }
            monthNum++;

        }
        // ДЗ 2/задание 3
        System.out.println(" ДЗ 2/задание 3");
        int sum3 = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum3;
            sum3 *= 1 + 0.07 * 6;
            System.out.printf(" Месяц %d , сумма %d  \n", i, sum3 - sumBefore);
        }
        // ДЗ 2/задание 4
        System.out.println(" ДЗ 2/задание 4");
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println(" Сегодня пятница,  " + currentFriday + " -е число. " + "Необходимо подготовитиь отчет.");

        }
        // ДЗ 3/задание 1
        System.out.println(" ДЗ 3/задание 1");
        int currenYear = 2022;
        int beginning = currenYear - 200;
        int ending = currenYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }
        // ДЗ 3/задание 2
        System.out.println(" ДЗ 3/задание 2");
        for (int i = 1; i < 10; i++) {
            System.out.println("2*" + i + " = " + 2 * i);
        }

    }
}