package com.qa;
import com.qa.model.Rabbit;
import com.qa.model.Animal;
import com.qa.model.Dog;
import com.qa.model.Cat;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // task 1
        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);
        System.out.println("Hello world!");

        // task 2
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(c);
        animalArrayList.add(c2);
        animalArrayList.add(d);
        animalArrayList.add(r);
        animalArrayList.add(r2);

        ArrayList<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.add(d);
        // dogArrayList.add(r);

        System.out.println("for each: ");
        for(Animal a: animalArrayList)
            System.out.println(a);

        System.out.println("for loop: ");
        for(int i = 0;i< animalArrayList.size();i++)
            System.out.println(animalArrayList.get(i));

        System.out.println("Iterator: ");
        Iterator<Animal> it = animalArrayList.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        // task 3
        HashMap<String, Animal> animalHashMap = new HashMap<>();

        animalHashMap.put(c.getName(),c);
        animalHashMap.put(c2.getName(),c2);
        animalHashMap.put(d.getName(),d);
        animalHashMap.put(r.getName(),r);
        animalHashMap.put(r2.getName(),r2);

        HashMap<Animal,String> animalStringHashMap = new HashMap<>();
        animalStringHashMap.put(c, "Cute");
        animalStringHashMap.put(c2, "Beautiful");
        animalStringHashMap.put(d, "Smart");
        animalStringHashMap.put(r, "Little");
        animalStringHashMap.put(r2, "Fluffy");

        for(Animal a: animalHashMap.values())
            System.out.println(a);

        System.out.println("print with key: ");
        for(String s: animalHashMap.keySet())
            System.out.println("key is: "+s+" and the value "+animalHashMap.get(s));

        // task 4
        HashSet<Animal> animalHashSet = new HashSet<>();
        animalHashSet.addAll(animalArrayList);
        animalHashSet.add(c);
        Iterator<Animal> iter = animalHashSet.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());}

        // task 5-1
        System.out.println("Searching Spot: ");
        for(Animal a: animalArrayList ) {
            if(a.getName().equals("Spot"))
                System.out.println("We found Spot and he is "+a.getAge());

    }
        System.out.println("Spot is here: "+animalHashMap.get("Spot"));

        // task 5-2
        Collections.sort(animalArrayList);
        System.out.println("Sorted animals: ");
        for(Animal a: animalArrayList) {
            System.out.println(a);
        }

        //task 5-3
        TreeMap<String, Animal> animalTreeMap = new TreeMap<>();
        animalTreeMap.putAll(animalHashMap);
        System.out.println("Tree Map: ");
        for(String s: animalTreeMap.keySet())
            System.out.println("Key is: "+s+" and the value: "+animalTreeMap.get(s));


    }
}