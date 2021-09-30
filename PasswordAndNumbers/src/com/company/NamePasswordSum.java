package com.company;

import java.util.Scanner;

public class NamePasswordSum {
    public static void main(String[] args) {
        Name nam = new Name();
        Zicle zet = new Zicle();
        Suma dod = new Suma();
        nam.name();
        zet.zicl();
        dod.sum();
    }
}
class Name {
    void name() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть своє ім'я");
        String name = in.nextLine();
        System.out.println("Доброго дня " + name);
    }
}
class Pass{
    int password() {
        Scanner in = new Scanner(System.in);
        System.out.println("Створіть пароль з цифр:");
        int pass = in.nextInt();
        System.out.println("Пароль успішно створений");
        return pass;
    }
}

class Zicle {
    Scanner in = new Scanner(System.in);
     void zicl(){
         Pass db = new Pass();
         final int PASS = db.password();
        for (int i = 0; i>=0;i++){
            System.out.println("Для доступу введіть пароль");
            int password = in.nextInt();
            if (password==PASS){
                System.out.println("Ви успішно пройшли автентифікацію");
                break;
            }
            else {
                System.out.println("ERROR");
                System.out.println("Неправильний пароль" +
                        " \n" +
                        "Повторіть спробу");
            }
        }
    }
}
class Suma{
    void  sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть три аргумент");
        double x1 = in.nextDouble(), x2 = in.nextDouble(), x3 = in.nextDouble();
        double s;
        s = x1+x2+x3;
        System.out.println("Сума = "+s);
    }
}
