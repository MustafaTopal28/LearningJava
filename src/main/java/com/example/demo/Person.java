package com.example.demo;

public class Person {
    private String name;
    private int age;
    private String residence;

    // Constructeur prenant tous les attributs comme paramètres
    public Person(String name, int age, String residence) {
        this.name = name;
        this.age = age;
        this.residence = residence;
    }

    // Méthodes pour obtenir les attributs
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }

    public static void main(String[] args) {
        // Vérifiez si au moins trois arguments (nom, âge, résidence) ont été passés
        if (args.length < 3) {
            System.out.println("Veuillez spécifier un nom, un âge et une résidence.");
            return;
        }

        // Récupérez les arguments depuis la ligne de commande
        String name = args[0];
        int age = Integer.parseInt(args[1]); // Convertissez la chaîne en int
        String residence = args[2];

        // Créez une instance de Person en utilisant les arguments
        Person person = new Person(name, age, residence);

        // Créez deux autres instances de Person
        Person person1 = new Person("Alice", 25, "Paris");
        Person person2 = new Person("Bob", 30, "New York");

        // Utilisez les méthodes pour obtenir et afficher les informations de l'instance person
        System.out.println("Nom de l'instance person : " + person.getName());
        System.out.println("Âge de l'instance person : " + person.getAge());
        System.out.println("Résidence de l'instance person : " + person.getResidence());

        // Utilisez les méthodes pour obtenir et afficher les informations des autres instances
        System.out.println("Nom de l'instance person1 : " + person1.getName());
        System.out.println("Âge de l'instance person1 : " + person1.getAge());
        System.out.println("Résidence de l'instance person1 : " + person1.getResidence());

        System.out.println("Nom de l'instance person2 : " + person2.getName());
        System.out.println("Âge de l'instance person2 : " + person2.getAge());
        System.out.println("Résidence de l'instance person2 : " + person2.getResidence());
    }
}
