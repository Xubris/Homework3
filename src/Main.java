public class Main {
    public static void main(String[] args) {
        //задание №1
        byte value1=30;
        System.out.println("Значение переменной Value1 с типом byte = "+value1);
        short value2=25789;
        System.out.println("Значение переменной Value2 с типом short = "+value2);
        int value3=100000;
        System.out.println("Значение переменной Value3 с типом int = "+value3);
        long value4=1234567890L;
        System.out.println("Значение переменной Value4 с типом long = "+value4);
        float value5=3.4E+32f;
        System.out.println("Значение переменной Value5 с типом float = "+value5);
        double value6=1.7E+300;
        System.out.println("Значение переменной Value6 с типом double = "+value6);

        //Задание №2
        float a =27.12f;
        long b =987678965549L;
        float c =2.786f;
        short d =569;
        short e =-159;
        short f = 27897;
        byte g = 67;
        //Задание№3
        byte lydmilaPavlovna=23;
        byte annaSergeevna=27;
        byte ekaterinaAndreevna=30;
        byte allStudents= (byte) (ekaterinaAndreevna+lydmilaPavlovna+annaSergeevna);
        short paper=480;
        byte paperPerPerson=(byte) (paper/allStudents);
        System.out.println("На каждого ученика расчитанно " +paperPerPerson+ " листов бумаги.");
        //Задание№4
        byte bottlesInTwoMinutes=16;
        byte  bottlesInOneMinutes=(byte)(bottlesInTwoMinutes/2);
        short bottlesInTwentyMinutes=(short)(bottlesInOneMinutes*20);
        System.out.println("За двадцать минут машина произвела "+bottlesInTwentyMinutes+" штук бутылок.");
        short bottlesInDays=(short)(bottlesInOneMinutes*1440);
        System.out.println("За сутки машина произвела "+bottlesInDays+" штук бутылок.");
        int bottlesInThreeDays=bottlesInDays*3;
        System.out.println("За три дня машина произвела "+bottlesInThreeDays+" штук бутылок.");
        int bottlesInMonth=bottlesInDays*31;
        System.out.println("За месяц машина произвела "+bottlesInMonth+" штук бутылок." );
        //Задание№5
        byte paint=120;
        byte whiteClass=2;
        byte brownClass=4;
        byte cclass=(byte)(paint/(whiteClass+brownClass));
        byte classWdhiteAll=(byte) (cclass*whiteClass);
        byte classBrownAll=(byte) (cclass*brownClass);
        System.out.println("В школе, где "+cclass+" классов, нужно "+classWdhiteAll+" банок белой краски и "+classBrownAll+" банок коричневой краски.");
        //Задание№6
        byte bananas=5;
        byte gramInABanana=80;
        short fiveGramBananas=(short)(gramInABanana*bananas);
        short milkMl=200;
        byte milk=(byte)(milkMl/100);
        byte milkGram=105;
        short milkGramAll=(short) (milk*milkGram);
        byte iceCream=2;
        short iceCreamGram=100;
        short iceCreamGramAll=(short)(iceCreamGram*iceCream);
        byte rawEggs=4;
        byte eggsGram=70;
        short rawEggsGramAll=(short) (rawEggs*eggsGram);
        short gramInACocktail=(short)(fiveGramBananas+milkGramAll+iceCreamGramAll+rawEggsGramAll);
        System.out.println("Грамм в коктеле "+gramInACocktail+".");
        short oneKg=1000;
        float cocktailKg=(float)gramInACocktail/(float)oneKg;
        System.out.println("В коктеле "+cocktailKg+" килограмм.");
        //Задание#7
        byte needOfResetKg=7;
        short needOfResetGramm=(short)(needOfResetKg*1000);
        short weinhtLossPerDay1Gramm=250;
        short weinhtLossPerDay2Gramm=500;
        byte resetOf250Gramm=(byte)(needOfResetGramm/weinhtLossPerDay1Gramm);
        System.out.println("Спортсмен теряя по 250г в день, сбросит вес за "+resetOf250Gramm+" дней.");
        byte resetOf500Gramm=(byte)(needOfResetGramm/weinhtLossPerDay2Gramm);
        System.out.println("Спортсмен теряя по 500г в день, сбросит вес за "+resetOf500Gramm+" дней.");
        short averageWeight=(short)((weinhtLossPerDay1Gramm+weinhtLossPerDay2Gramm)/2);
        float averageWeightLoss=(float)needOfResetGramm/(float)averageWeight;
        System.out.println("Спортсмен в среднем потерчет 7кг за "+averageWeightLoss+" дней.");
        //Задание№8
        int mashaEarnsInTheMonth=67760;
        int denisEarnsInTheMonth=83690;
        int kristinaEarnsInTheMonth=76230;
        float proc=1.1f;
        float increasedMashaEarnsInTheMonth=mashaEarnsInTheMonth*proc;
        float increasedDenisEarnsInTheMonth=denisEarnsInTheMonth*proc;
        float increasedKristinaEarnsInTheMonth=kristinaEarnsInTheMonth*proc;
        byte montInAYear=12;
        int mashaEarnsInTheYear=mashaEarnsInTheMonth*montInAYear;
        int denisEarnsInTheYear=denisEarnsInTheMonth*montInAYear;
        int kristinaEarnsInTheYear=kristinaEarnsInTheMonth*montInAYear;
        int increasedMashaEarnsInTheYear=(int)increasedMashaEarnsInTheMonth*montInAYear;
        int increasedDenisEarnsInTheYear=(int)increasedDenisEarnsInTheMonth*montInAYear;
        int increasedKristinaEarnsInTheYear=(int)increasedKristinaEarnsInTheMonth*montInAYear;
        int differenceInAnnualEarningsMasha=increasedMashaEarnsInTheYear-mashaEarnsInTheYear;
        int differenceInAnnualEarningsDenis=increasedDenisEarnsInTheYear-denisEarnsInTheYear;
        int differenceInAnnualEarningsKristina=increasedKristinaEarnsInTheYear-kristinaEarnsInTheYear;
        System.out.println("Маша теперь получает "+increasedMashaEarnsInTheYear+" рублей.Годовой доход вырос на "+differenceInAnnualEarningsMasha+" рублей.");
        System.out.println("Денис теперь получает "+increasedDenisEarnsInTheYear+" рублей.Годовой доход вырос на "+differenceInAnnualEarningsDenis+" рублей.");
        System.out.println("Кристина теперь получает "+increasedKristinaEarnsInTheYear+" рублей.Годовой доход вырос на "+differenceInAnnualEarningsKristina+" рублей.");
    }
}