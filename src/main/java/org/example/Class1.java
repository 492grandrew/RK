package org.example;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Class1 {
    public void class1(){
        Scanner scanner = new Scanner(System.in);
        int a = 1;

        //створення списку
        var random = new SecureRandom();
        var list = Arrays.asList("red", "blue", "green", "white", "black");

        //вивід списка
        System.out.println("\n" + list);


        //генерація рандомного слова
        String randomElement = list.get(random.nextInt(list.size()));

        //вивід правильної відповіді
        //System.out.println(randomElement);

        while (a==1){

            System.out.print("Введеть колір з списку вище: ");
            String vvod = scanner.nextLine();

            if (randomElement.equals(vvod)){
                System.out.println("Well done" + "\n");
                a++;

            }else {

                if (randomElement == "red"){
                    System.out.println("Невгадав \nПідсказка: колір ютубу");
                } else if (randomElement == "blue") {
                    System.out.println("Невгадав \nПідсказка: колір неба");
                }else if (randomElement == "green") {
                    System.out.println("Невгадав \nПідсказка: колір трави");
                }else if (randomElement == "white") {
                    System.out.println("Невгадав \nПідсказка: колір паперу");
                }else if (randomElement == "black") {
                    System.out.println("Невгадав \nПідсказка: колір ночі");
                }
            }
        }
    }
}
