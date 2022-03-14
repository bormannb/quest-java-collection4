import java.util.Map;
import java.util.TreeMap;
import java.util.*;
import java.util.List;



public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet


        //Comparator erstellen:
            //Vergleich der alphab. Sortierung
            Comparator<Hero> comparator = new Comparator<Hero>() {  
            @Override  
            public int compare(Hero originalHero, Hero compare) {  
                return originalHero.getName().compareTo(compare.getName());  
            }  
        };  

        // 1.Building a TreeMap named party with key Hero and value Flower.
        // 2. Add to party the following key/value pairs:
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision have a Tulip
        // Captain America have a Lily
        // Doctor Strange and Black Widow have a Violet


        TreeMap<Hero, Flower>party=new TreeMap<>(comparator);
        party.put(hulk, rose);  
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);  
        party.put(captainAmerica, lily);  
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        // In one line, display whether party contains the instance begonia.

        // evtl containsKey -> containsValue

        // 6. Search for a key and a value
        // It is possible to find out whether an associative array contains a key or a value, using the methods containsKey(Object o) and containsValue(Object o):
        
        System.out.println(party.containsValue(begonia)); 

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        // Browse the associative array in alphabetical order of hero names, and display, 
        // for each of them, its assigned flower.

        for (Map.Entry<Hero, Flower> entry : party.entrySet()) {  
            Hero hero = entry.getKey();  
            Flower flower = entry.getValue();  
            //System.out.println(hero.getName() + ": " + flower.getName());  
            System.out.println(flower.getName());
        }
        


    }
}
