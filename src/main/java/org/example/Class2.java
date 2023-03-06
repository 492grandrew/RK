package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class2 {
    public void class2(){
        Scanner scanner = new Scanner(System.in);




        System.out.println("\n1 - Create a new file \n2 - Display the file \n3 - Add a new item to the file");
        System.out.print("Введіть цифру: ");

        int meny2 = scanner.nextInt();

        switch (meny2){
            case 1:
                try(FileWriter writer = new FileWriter("Subject.txt", false))
                {
                    System.out.print("\nВведіть назву предмету: ");
                    String neveruse = scanner.nextLine();
                    String text = scanner.nextLine();
                    writer.write(text);
                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                break;
            case 2:
                System.out.println("\nВміст файлу: ");
                try(FileReader reader = new FileReader("Subject.txt"))
                {
                    int c;
                    while((c=reader.read())!=-1){

                        System.out.print((char)c);
                    }
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                System.out.print("\n\n");
                break;
            case 3:
                try(FileWriter writer = new FileWriter("Subject.txt", false))
                {
                    System.out.print("\nВведіть назву предмету: ");
                    String neveruse1 = scanner.nextLine();
                    String text1 = scanner.nextLine();
                    writer.write(text1);
                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }


                System.out.println("\nВміст файлу: ");
                try(FileReader reader = new FileReader("Subject.txt"))
                {
                    int c;
                    while((c=reader.read())!=-1){

                        System.out.print((char)c);
                    }
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                System.out.print("\n\n");
                break;
            default:
                System.out.println("Opss.. \t Oshibka \t Alarm \t PcPotato \n ");
                break;
        }
    }
}
