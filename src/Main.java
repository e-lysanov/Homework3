public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int first = -14055;
        byte second = 127;
        short third = -32768;
        long fourth = 349958293566L;
        float fifth = 34.5504868F;
        double sixth = -22.99884455;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        byte generalStudents = (byte) (lP + aS + eA);
        short generalPaper = 480;
        byte individualPaper = (byte) (generalPaper / generalStudents);
        System.out.println("На каждого ученика рассчитано " + individualPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        byte bottlesPerTwoMinutes = 16;
        byte twoMinutes = 2;
        byte bottlesPerMinute = (byte) (bottlesPerTwoMinutes / twoMinutes);
        byte twentyMinutes = 20;
        short bottlesPerTwentyMinutes = (short) (bottlesPerMinute * twentyMinutes);
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        short day = 1440;
        short bottlesPerDay = (short) (bottlesPerMinute * day);
        System.out.println("За 1 день машина произвела " + bottlesPerDay + " штук бутылок");
        short threeDays = (short) (day * 3);
        int bottlesPerThreeDays = bottlesPerMinute * threeDays;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int mounth = threeDays * 10;
        int bottlesPerMounth = bottlesPerMinute * mounth;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMounth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        short generalBanks = 120;
        // наборы: белых по 2 на класс, коричневых - по 4
        byte oneKit = 2 + 4;
        short classes = (short) (generalBanks / oneKit);
        short white = (short) (classes * 2);
        short brown = (short) (classes * 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        byte bananas = 5;
        short weightBanana = 80;
        // 400 бананы, 210 молоко, 200 мороженое, 280 яца, всего 1090 = 1.09 кг
        short generalWeightBananas = (short) (bananas * weightBanana);
        short milk = 200;
        short oneHundredMilk = (short) (milk / 100);
        short weightMilk = 105;
        short generalWeightMilk = (short) (oneHundredMilk * weightMilk);
        byte iceCreamPieces = 2;
        short iceCreamOnePieceWeight = 100;
        short generalWeightIceCream = (short) (iceCreamPieces * iceCreamOnePieceWeight);
        byte eggs = 4;
        short oneEggWeight = 70;
        short generalWeightEggs = (short) (eggs * oneEggWeight);
        short generalWeightG = (short) (generalWeightEggs + generalWeightBananas + generalWeightMilk + generalWeightIceCream);
        double generalWeightK = (generalWeightG / 1000) + ((generalWeightG % 1000) * 0.001);
        System.out.println("Масса спортзавтрака " + generalWeightG + " граммов или " + generalWeightK + " килограммов");
    }
    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        //byte overWeightK = 7;
        int overWeightG = 7000;
        float overWeightGF = 7000;
        short minDelG = 250;
        short maxDelG = 500;
        short medDelG = (short) ((maxDelG + minDelG) / 2);
        float medDelGF = (short) ((maxDelG + minDelG) / 2);
        int maxDays = overWeightG / minDelG;
        int minDays = overWeightG / maxDelG;
        // за неименем возможности на данном этапе обучения использовать циклы придумал костыль
        // за счет деления остатка от деления перевеса на средний дневной весогоночный вес на остаток от деления перевеса уменьшенного на средний дневной весогоночный вес на средний дневной весогоночный вес, убедился что этот остаток есть
        float overDays = (overWeightGF % medDelGF) / ((overWeightGF - medDelGF) % medDelGF);
        int medDays = overWeightG / medDelG;
        System.out.println("Ежедневно скидывая по " + minDelG + " граммов спортсмен уложится в категорию за " + maxDays + " дней");
        System.out.println("Ежедневно скидывая по " + maxDelG + " граммов спортсмен уложится в категорию за " + minDays + " дней");
        System.out.println("Ежедневно скидывая по " + medDelG + " граммов спортсмен уложится в категорию за " + medDays + " дней и " + overDays + " дней со сниженной нагрузкой (NaN = 0)");
    }
}