package day01;

import java.util.ArrayList;

public class C03_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            sayilar.add(i);



        }
        System.out.println("17.satır"+sayilar);


        System.out.println("Araylistin icerigi    "   );

        for (int num : sayilar){

            System.out.println(num);
        }
    }


}
