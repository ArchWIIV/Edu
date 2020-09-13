package classforedu.main;
import java.util.Scanner;

public class Pract {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Пожалуйста введите кол-во собак в питомнике");
        int count = cons.nextInt();
        Dog[] mass_dog = new Dog[count];
        //Инициализация собак
        String as;
        String av;
        int az;

        for(int i = 0; i < count; i++) {
            System.out.println("Введите имя, цвет и возрас собаки:");
            System.out.print("Имя? - " );
            as = cons.next();
            System.out.print("Цвет? - " );
            av = cons.next();
            System.out.print("Возраст собаки? - ");
            az = cons.nextInt();
            Dog dog = new Dog(as, av, az);
            mass_dog[i] = dog;
        }

        for(int i = 0; i < count; i++) {

            System.out.println(mass_dog[i].ToString());
            System.out.println("Возраст, по человеческим годам собаки по имени - " + mass_dog[i].name +
                    " - " + mass_dog[i].Dog_To_Human_Age());
        }
    System.out.println("##############################################################################");


        shape.name = "Square";
        shape.angels = 4;
        shape.square = 16;
        shape.v = 16*3;

        String b = Shape.Ball.ToString();
        String c = Shape.Book.ToString();
        String a = shape.ToString();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
