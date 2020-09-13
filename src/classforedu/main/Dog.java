package classforedu.main;
import java.util.Scanner;

public class Dog {
    public String name;
    public String color;
    public int age;

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int Dog_To_Human_Age() {
        return( age * 7);
    }
    public String ToString(){
        return("Имя собаки - " + name + "\nЦвет собаки - " + color + "\nВозраст собаки - " + age);

    }
}
