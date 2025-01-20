package javademo;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        Safe safe = new Safe("0000");

        while (true) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            System.out.print("");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Anna uusi PIN-koodi: ");
                String newPassword = sc.next();
                safe.changePassword(newPassword);
            } else if (choice == 2) {
                System.out.print("Anna kansioon lisättävä tieto: ");
                String data = sc.next();
                safe.addToFolder(data);
            } else if (choice == 3) {
                System.out.print("Anna PIN-koodi: ");
                String enteredPassword = sc.next();
                ArrayList<String> folder = safe.listFolder(enteredPassword);
                if (folder != null) {
                    for (String data : folder) {
                        System.out.println(data);
                    }
                } else {
                    System.out.println("Väärä PIN-koodi.");
                }
            } else if (choice == 0) {
                System.out.println("Kiitos ohjelman käytöstä.");
                break;
            }
        
        }
        sc.close();
    }
}
