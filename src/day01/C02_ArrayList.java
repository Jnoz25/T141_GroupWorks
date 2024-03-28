package day01;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ArrayList {

    public static void main(String[] args) {

        //bir array list oluşturun ve bu listede 5 farklı meyve saklayın ve bu meyveleri tersten yazdırın

        ArrayList<String> meyvelistesi = new ArrayList<>(Arrays.asList("Elma","Üzüm","Armut","Muz","Çilek"));

        System.out.println(meyvelistesi);
        for (int i = meyvelistesi.size()-1; i >=0 ; i--) {
            System.out.print(meyvelistesi.get(i));

        }




    }
}
