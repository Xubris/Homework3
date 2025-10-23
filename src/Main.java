public class Main {
    public static void main(String[] args) {
        //задание №1
        byte Value1=30;
        System.out.println("Значение переменной Value1 с типом byte = "+Value1);
        short Value2=25789;
        System.out.println("Значение переменной Value2 с типом short = "+Value2);
        int Value3=100000;
        System.out.println("Значение переменной Value3 с типом int = "+Value3);
        long Value4=1234567890L;
        System.out.println("Значение переменной Value4 с типом long = "+Value4);
        float Value5=3.4E+32f;
        System.out.println("Значение переменной Value5 с типом float = "+Value5);
        double Value6=1.7E+300;
        System.out.println("Значение переменной Value6 с типом double = "+Value6);

        //Задание №2
        float a =27.12f;
        long b =987678965549L;
        float c =2.786f;
        short d =569;
        short e =-159;
        short f = 27897;
        byte g = 67;
        //Задание№3
        byte LydmilaPavlovna=23;
        byte AnnaSergeevna=27;
        byte EkaterinaAndreevna=30;
        byte AllStudents= (byte) (EkaterinaAndreevna+LydmilaPavlovna+AnnaSergeevna);
        short Paper=480;
        byte PaperPerPerson=(byte) (Paper/AllStudents);
        System.out.println("На каждого ученика расчитанно " +PaperPerPerson+ " листов бумаги.");
        //Задание№4
        byte BottlesInTwoMinutes=16;
        byte  BottlesInOneMinutes=(byte)(BottlesInTwoMinutes/2);
        short BottlesInTwentyMinutes=(short)(BottlesInOneMinutes*20);
        System.out.println("За двадцать минут машина произвела "+BottlesInTwentyMinutes+" штук бутылок.");
        short BottlesInDays=(short)(BottlesInOneMinutes*1440);
        System.out.println("За сутки машина произвела "+BottlesInDays+" штук бутылок.");
        int BottlesInThreeDays=BottlesInDays*3;
        System.out.println("За три дня машина произвела "+BottlesInThreeDays+" штук бутылок.");
        int BottlesInMonth=BottlesInDays*31;
        System.out.println("За месяц машина произвела "+BottlesInMonth+" штук бутылок." );
        //Задание№5
        byte Paint=120;
        byte WhiteClass=2;
        byte BrownClass=4;
        byte Class=(byte)(Paint/(WhiteClass+BrownClass));
        byte ClassWdhiteAll=(byte) (Class*WhiteClass);
        byte ClassBrownAll=(byte) (Class*BrownClass);
        System.out.println("В школе, где "+Class+" классов, нужно "+ClassWdhiteAll+" банок белой краски и "+ClassBrownAll+" банок коричневой краски.");
        //Задание№6
        byte Bananas=5;
        byte GramInABanana=80;
        short FiveGramBananas=(short)(GramInABanana*Bananas);
        short MilkMl=200;
        byte Milk=(byte)(MilkMl/100);
        byte MilkGram=105;
        short MilkGramAll=(short) (Milk*MilkGram);
        byte IceCream=2;
        short IceCreamGram=100;
        short IceCreamGramAll=(short)(IceCreamGram*IceCream);
        byte RawEggs=4;
        byte EggsGram=70;
        short RawEggsGramAll=(short) (RawEggs*EggsGram);
        short GramInACocktail=(short)(FiveGramBananas+MilkGramAll+IceCreamGramAll+RawEggsGramAll);
        System.out.println("Грамм в коктеле "+GramInACocktail+".");
        short OneKg=1000;
        float CocktailKg=(float)GramInACocktail/(float)OneKg;
        System.out.println("В коктеле "+CocktailKg+" килограмм.");
        //Задание#7
        byte NeedOfResetKg=7;
        short NeedOfResetGramm=(short)(NeedOfResetKg*1000);
        short WeinhtLossPerDay1Gramm=250;
        short WeinhtLossPerDay2Gramm=500;
        byte ResetOf250Gramm=(byte)(NeedOfResetGramm/WeinhtLossPerDay1Gramm);
        System.out.println("Спортсмен теряя по 250г в день, сбросит вес за "+ResetOf250Gramm+" дней.");
        byte ResetOf500Gramm=(byte)(NeedOfResetGramm/WeinhtLossPerDay2Gramm);
        System.out.println("Спортсмен теряя по 500г в день, сбросит вес за "+ResetOf500Gramm+" дней.");
        short AverageWeight=(short)((WeinhtLossPerDay1Gramm+WeinhtLossPerDay2Gramm)/2);
        float AverageWeightLoss=(float)NeedOfResetGramm/(float)AverageWeight;
        System.out.println("Спортсмен в среднем потерчет 7кг за "+AverageWeightLoss+" дней.");
        //Задание№8
        int MashaEarnsInTheMonth=67760;
        int DenisEarnsInTheMonth=83690;
        int KristinaEarnsInTheMonth=76230;
        float proc=1.1f;
        float IncreasedMashaEarnsInTheMonth=MashaEarnsInTheMonth*proc;
        float IncreasedDenisEarnsInTheMonth=DenisEarnsInTheMonth*proc;
        float IncreasedKristinaEarnsInTheMonth=KristinaEarnsInTheMonth*proc;
        byte MontInAYear=12;
        int MashaEarnsInTheYear=MashaEarnsInTheMonth*MontInAYear;
        int DenisEarnsInTheYear=DenisEarnsInTheMonth*MontInAYear;
        int KristinaEarnsInTheYear=KristinaEarnsInTheMonth*MontInAYear;
        int IncreasedMashaEarnsInTheYear=(int)IncreasedMashaEarnsInTheMonth*MontInAYear;
        int IncreasedDenisEarnsInTheYear=(int)IncreasedDenisEarnsInTheMonth*MontInAYear;
        int IncreasedKristinaEarnsInTheYear=(int)IncreasedKristinaEarnsInTheMonth*MontInAYear;
        int DifferenceInAnnualEarningsMasha=IncreasedMashaEarnsInTheYear-MashaEarnsInTheYear;
        int DifferenceInAnnualEarningsDenis=IncreasedDenisEarnsInTheYear-DenisEarnsInTheYear;
        int DifferenceInAnnualEarningsKristina=IncreasedKristinaEarnsInTheYear-KristinaEarnsInTheYear;
        System.out.println("Маша теперь получает "+IncreasedMashaEarnsInTheYear+" рублей.Годовой доход вырос на "+DifferenceInAnnualEarningsMasha+" рублей.");
        System.out.println("Денис теперь получает "+IncreasedDenisEarnsInTheYear+" рублей.Годовой доход вырос на "+DifferenceInAnnualEarningsDenis+" рублей.");
        System.out.println("Кристина теперь получает "+IncreasedKristinaEarnsInTheYear+" рублей.Годовой доход вырос на "+DifferenceInAnnualEarningsKristina+" рублей.");
    }
}