package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;

        while (a == 1){


            System.out.println("1 - для розв'язку першої задачі \n2 - для розв'язку другої задачі 2\n3 - вихід з програми");
            System.out.print("Введіть цифру: ");

            int meny = scanner.nextInt();

            switch (meny){
                case 1:
                    Class1 class1 = new Class1();
                    class1.class1();
                    break;
                case 2:
                    Class2 class2 = new Class2();
                    class2.class2();
                    break;
                case 3:
                    a++;
                    break;
                default:
                    System.out.println("невірно");
            }
        }
    }
}