public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Человек несовершеннолетний, нужно подождать");
        }

        System.out.println("Задача 2");
        int temperatyre = 5;
        if (temperatyre >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Можно ехать спокойно");
        } else {
            System.out.println("Придется заплатить штраф");
        }

        System.out.println("Задача 4");
        age = 37;
        if (age < 2) {
            System.out.println("Если возраст человека меньше 2 лет, то ему пора спать");
        }
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека от 2 до 6, то ему нужно ходить в детский сад");
        } else if (age > 7 && age < 18) {
            System.out.println("Если возраст человека от 7 до 18, то ему надо ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека от 18 до 24, то ему нужно посещать университет");
        } else if (age > 24 && age < 60) {
            System.out.println("Если возраст человека больше 24 то ему надо ходить на работу");
        }
        if (age > 60) {
            System.out.println("Если возраст человека больше 60, то ему можно отдохнуть");
        }

        System.out.println("Задача 5");
        age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка меньше 5 лет, он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка от 5 до 14, то можно кататься в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если ребенку больше 14 лет, то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        int totalPeople = 102;
        int sitPeolple = 60;
        int stendPeople = totalPeople - sitPeolple;
        System.out.println("Стоячих мест " + stendPeople + "");
        if (totalPeople >= 102) {
            System.out.println("Вагон забит полностью");
        }
        if (sitPeolple < 60) {
            System.out.println("Сидячие места есть");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (stendPeople == totalPeople - sitPeolple) {
            System.out.println("Стоячих мест нет");
        } else {
            System.out.println("Стоячие места есть");
        }

        System.out.println("Задача 7");
        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("Большее число " + a + "");
        } else if (b > a && b > c) {
            System.out.println("Большее число " + b + "");
        } else {
            System.out.println("С большее число");
        }


    }
}