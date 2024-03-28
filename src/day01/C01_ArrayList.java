package day01;

import java.util.ArrayList;

public class C01_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> liste1 = new ArrayList<>();

        // add methodu;

        liste1.add("Turkiye");
        liste1.add("Almanya");
        liste1.add("Fransa");
        liste1.add("Ingiltere");
        liste1.add("Italya");

        int listeboyutu = liste1.size();
        System.out.println("Arraylist boyutu " +listeboyutu);

        if (liste1.isEmpty()){

            System.out.println("Arraylist Bos");

        }else {
            System.out.println("Arraylist bos değil");
        }

        String ulke = liste1.get(2);
        System.out.println("Index 2deki ulke :" +ulke);

        //get methodu
        //liste1.set(2,"Japonya");
        //System.out.println(liste1);

        // remove methodu
        //liste1.remove("Almanya"); //almanya ogesini sildi
        //System.out.println(liste1);

        //Clear methodu
        //liste1.clear();
        //System.out.println(liste1);

        //equals methodu

        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("Turkiye");
        liste2.add("Almanya");
        liste2.add("Belcika");
        liste2.add("Portekiz");

        if (liste1.equals(liste2)){
            System.out.println("Listeler eşittir");
        }else {
            System.out.println("Listeler eşit değildir");
        }

        //remove all methodu

        liste1.removeAll(liste2);
        System.out.println(liste1);











    }
}
