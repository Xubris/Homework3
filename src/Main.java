public class Main {
    public static void main(String[] args) {
        //задание №1
        byte value1=30;
        System.out.println("Значение переменной value1 с типом byte = "+value1);
        short value2=25789;
        System.out.println("Значение переменной value2 с типом short = "+value2);
        int value3=100000;
        System.out.println("Значение переменной value3 с типом int = "+value3);
        long value4=1234567890L;
        System.out.println("Значение переменной value4 с типом long = "+value4);
        float value5=3.4E+32f;
        System.out.println("Значение переменной value5 с типом float = "+value5);
        double value6=1.7E+300;
        System.out.println("Значение переменной value6 с типом double = "+value6);

        //Задание №2
        float a =27.12f;
        long b =987678965549L;
        float c =2.786f;
        short d =569;
        short e =-159;
        short f = 27897;
        byte g = 67;
        //Задание№3
        byte Lydmila_Pavlovna=23;
        byte Anna_Sergeevna=27;
        byte Ekaterina_Andreevna=30;
        byte all_students= (byte) (Ekaterina_Andreevna+Lydmila_Pavlovna+Anna_Sergeevna);
        short Paper=480;
        byte Paper_per_person=(byte) (480/all_students);
        System.out.println("На каждого ученика расчитанно " +Paper_per_person+ " листов бумаги.");
        //Задание№4
        byte Bottles_in_two_minutes=16;
        byte  Bottles_in_one_minutes=16/2;
        short Bottles_in_twenty_minutes=(short)(Bottles_in_one_minutes*20);
        System.out.println("За двадцать минут машина произвела "+Bottles_in_twenty_minutes+" штук бутылок.");
        short Bottles_in_days=(short)(Bottles_in_one_minutes*1440);
        System.out.println("За сутки машина произвела "+Bottles_in_days+" штук бутылок.");
        int Bottles_in_three_days=Bottles_in_days*3;
        System.out.println("За три дня машина произвела "+Bottles_in_three_days+" штук бутылок.");
        int Bottles_in_month=Bottles_in_days*31;
        System.out.println("За месяц машина произвела "+Bottles_in_month+" штук бутылок." );
        //Задание№5
        byte paint=120;
        byte white_class=2;
        byte brown_class=4;
        byte Class=(byte)(paint/(white_class+brown_class));
        byte class_wdhite_all=(byte) (Class*white_class);
        byte class_brown_all=(byte) (Class*brown_class);
        System.out.println("В школе, где "+Class+" классов, нужно "+class_wdhite_all+" банок белой краски и "+class_brown_all+" банок коричневой краски.");
        //Задание№6
        byte bananas=5;
        byte gram_in_a_banana=80;
        short five_gram_bananas=(short)(gram_in_a_banana*bananas);
        short milk_ml=200;
        byte milk=(byte)(milk_ml/100);
        byte milk_gram=105;
        short milk_gram_all=(short) (milk*milk_gram);
        byte ice_cream=2;
        short ice_cream_gram=100;
        short ice_cream_gram_all=(short)(ice_cream_gram*ice_cream);
        byte raw_eggs=4;
        byte eggs_gram=70;
        short raw_eggs_gram_all=(short) (raw_eggs*eggs_gram);
        short gram_in_a_cocktail=(short)(five_gram_bananas+milk_gram_all+ice_cream_gram_all+raw_eggs_gram_all);
        System.out.println("Грамм в коктеле "+gram_in_a_cocktail+".");
        short one_kg=1000;
        float cocktail_kg=(float)gram_in_a_cocktail/(float)one_kg;
        System.out.println("В коктеле "+cocktail_kg+" килограмм.");
        //Задание#7
        byte need_of_reset_kg=7;
        short need_of_reset_gramm=(short)(need_of_reset_kg*1000);
        short weinht_loss_per_day1_gramm=250;
        short weinht_loss_per_day2_gramm=500;
        byte reset_of_250gramm=(byte)(need_of_reset_gramm/weinht_loss_per_day1_gramm);
        System.out.println("Спортсмен теряя по 250г в день, сбросит вес за "+reset_of_250gramm+" дней.");
        byte reset_of_500gramm=(byte)(need_of_reset_gramm/weinht_loss_per_day2_gramm);
        System.out.println("Спортсмен теряя по 500г в день, сбросит вес за "+reset_of_500gramm+" дней.");
        short average_weight=(short)((weinht_loss_per_day1_gramm+weinht_loss_per_day2_gramm)/2);
        float average_weight_loss=(float)need_of_reset_gramm/(float)average_weight;
        System.out.println("Спортсмен в среднем потерчет 7кг за "+average_weight_loss+" дней.");
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