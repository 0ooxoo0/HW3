//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        //---------------------------------------------
        int x = 0;
        int pav=23;
        int lud=27;
        int andr=30;
        x=480/(pav+lud+andr);
        System.out.printf("На каждого ученика рассчитано "+ x +" листов бумаги");

        System.out.printf("%n "); //Enter

        int mashina = 8;
        System.out.printf("За 20 минут машина произвела: " + (mashina*20)+" штук бутылок");
        System.out.printf("За 1 сутки машина произвела: " + (mashina*60*24)+" штук бутылок");
        System.out.printf("За 3 дня машина произвела: " + (mashina*60*24*3)+" штук бутылок");
        System.out.printf("За месяц машина произвела: " + (mashina*60*24*31)+" штук бутылок");

        System.out.printf("%n "); //Enter

        System.out.printf("В школе, где " + 120/(4+2) + " классов, нужно " + (120/(4+2)*2)+ " банок белой краски и " +(120/(4+2)*4)+ " банок коричневой краски");

        System.out.printf("%n "); //Enter

        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;

        System.out.printf("Итоговый вес: " + (((banana*5)+(milk*2)+(iceCream*2)+(egg*4))/1000)+" кг");

        System.out.printf("%n "); //Enter

        System.out.printf("если по 250: "+ 7000/250+"%n если по 500 то: "+7000/500+"%n Среднее: "+((7000/250)+(7000/500))/2);

        System.out.printf("%n "); //Enter

        int masha = 67760;
        int mashaNew = masha + masha * 10 / 100;
        System.out.printf("Маша теперь получает " + mashaNew + " рублей. " + "Годовой доход вырос на " + (mashaNew * 12 - masha * 12) + " рублей.");

        System.out.printf("%n "); //Enter

        int denis = 83690;
        int denisNew = denis + denis * 10 / 100;
        System.out.printf("Денис теперь получает " + denisNew + " рублей. " + "Годовой доход вырос на " + (denisNew * 12 - denis * 12) + " рублей.");

        System.out.printf("%n "); //Enter

        int kristina = 76230;
        int kristinaNew = kristina + kristina * 10 / 100;
        System.out.printf("Кристина теперь получает " + kristinaNew + " рублей. " + "Годовой доход вырос на " + (kristinaNew * 12 - kristina * 12) + " рублей.");
    }
}