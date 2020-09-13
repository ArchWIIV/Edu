package classforedu.main;

public class Shape {
    public String name;
    public int angels;
    public double square;
    public double v;

    public String ToString(){
        return("Название фигуры - " + name + "\n "
                + "Количество углов - " + angels + "\n " + "Площадь фигуры - " + square
                + "\n " + "Обьем фигуры - " + v);


    }
    public static class Ball{
        private static int rigidity = 18;
        private static int size = 13;
        private static double smoothness = 0.23;

        public static String ToString(){
            return("Мяч\n Жесткость - " + rigidity + "\n Размер - " + size + "\n Гладкость - " + smoothness);
        }

    }

    public static class Book{
        private static String name = "Высшая математика часть два";
        private static int numbers_of_pages = 9000;
        private static int age = 12;
        private static String difficulty = "Очень сложно";

        public static String ToString(){
            return("Название - " + name + "\n Возраст - " + age + "\n Кол-во страниц - "
                    + numbers_of_pages + "\n Сложность - " + difficulty );
        }

    }
}