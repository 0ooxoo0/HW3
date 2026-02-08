public class Main
{
    public static void main(String[] args)
    {
        int a = 569;
        byte b = 67;
        short c = -159;
        long d = 987678965549L;
        int e = 27897;
        double f = 27.12;
        float g = 2.786f;

        System.out.println("Значение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной e с типом int равно "+e);
        System.out.println("Значение переменной f с типом double равно "+f);
        System.out.println("Значение переменной g с типом float равно "+g);

        System.out.printf("%n "); //Enter

        //---------------------------------------------
        final int TOTAL_PAPER = 480;
        final int STUDENTS_PAVEL = 23;
        final int STUDENTS_LUDA = 27;
        final int STUDENTS_ANDREY = 30;

        int x = TOTAL_PAPER / (STUDENTS_PAVEL + STUDENTS_LUDA + STUDENTS_ANDREY);
        System.out.printf("На каждого ученика рассчитано "+ x +" листов бумаги");

        System.out.printf("%n "); //Enter

        final int BOTTLES_PER_2_MINUTES = 16;
        final int BOTTLES_PER_MINUTE = BOTTLES_PER_2_MINUTES / 2;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;

        System.out.printf("За 20 минут машина произвела: " + (BOTTLES_PER_MINUTE * 20)+" штук бутылок");
        System.out.printf("За 1 сутки машина произвела: " + (BOTTLES_PER_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY)+" штук бутылок");
        System.out.printf("За 3 дня машина произвела: " + (BOTTLES_PER_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * 3)+" штук бутылок");
        System.out.printf("За месяц машина произвела: " + (BOTTLES_PER_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * 31)+" штук бутылок");

        System.out.printf("%n "); //Enter

        final int TOTAL_PAINT_CANS = 120;
        final int WHITE_PER_CLASS = 2;
        final int BROWN_PER_CLASS = 4;
        final int PAINT_PER_CLASS = WHITE_PER_CLASS + BROWN_PER_CLASS;

        int classes = TOTAL_PAINT_CANS / PAINT_PER_CLASS;
        System.out.printf("В школе, где " + classes + " классов, нужно " + (classes * WHITE_PER_CLASS)+" банок белой краски и " +(classes * BROWN_PER_CLASS)+ " банок коричневой краски");

        System.out.printf("%n "); //Enter

        final double BANANA_WEIGHT = 80;
        final double MILK_WEIGHT = 105;
        final double ICE_CREAM_WEIGHT = 100;
        final double EGG_WEIGHT = 70;
        final double GRAMS_IN_KILOGRAM = 1000;

        double totalWeight = ((BANANA_WEIGHT * 5) + (MILK_WEIGHT * 2) + (ICE_CREAM_WEIGHT * 2) + (EGG_WEIGHT * 4)) / GRAMS_IN_KILOGRAM;
        System.out.printf("Итоговый вес: " + totalWeight + " кг");

        System.out.printf("%n "); //Enter

        final int WEIGHT_LOSS_GOAL = 7000;
        final int DAYS_PER_WEEK = 7;
        final int LIGHT_TRAINING = 250;
        final int INTENSE_TRAINING = 500;

        int daysLight = WEIGHT_LOSS_GOAL / LIGHT_TRAINING;
        int daysIntense = WEIGHT_LOSS_GOAL / INTENSE_TRAINING;
        int averageDays = (daysLight + daysIntense) / 2;

        System.out.printf("если по 250: "+ daysLight + "%n если по 500 то: " + daysIntense + "%n Среднее: " + averageDays);

        System.out.printf("%n "); //Enter

        final double SALARY_INCREASE_PERCENT = 10.0;
        final int MONTHS_IN_YEAR = 12;

        double masha = 67760;
        double mashaNew = masha * (1 + SALARY_INCREASE_PERCENT / 100);
        double mashaAnnualIncrease = (mashaNew - masha) * MONTHS_IN_YEAR;
        System.out.printf("Маша теперь получает " + mashaNew + " рублей. " + "Годовой доход вырос на " + mashaAnnualIncrease + " рублей.");

        System.out.printf("%n "); //Enter

        double denis = 83690;
        double denisNew = denis * (1 + SALARY_INCREASE_PERCENT / 100);
        double denisAnnualIncrease = (denisNew - denis) * MONTHS_IN_YEAR;
        System.out.printf("Денис теперь получает " + denisNew + " рублей. " + "Годовой доход вырос на " + denisAnnualIncrease + " рублей.");

        System.out.printf("%n "); //Enter

        double kristina = 76230;
        double kristinaNew = kristina * (1 + SALARY_INCREASE_PERCENT / 100);
        double kristinaAnnualIncrease = (kristinaNew - kristina) * MONTHS_IN_YEAR;
        System.out.printf("Кристина теперь получает " + kristinaNew + " рублей. " + "Годовой доход вырос на " + kristinaAnnualIncrease + " рублей.");
    }
}
