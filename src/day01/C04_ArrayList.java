package day01;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_ArrayList {
    public static void main(String[] args) {

        ArrayList<String > renklistesi = new ArrayList<>(Arrays.asList("Kırmıız","Yeşil","Mavi"));

        for (String renk : renklistesi){
            System.out.println(renk);

        }


    }
}
