package main;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);


        Hedgehog hedgehog = new Hedgehog();
        

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int valinta = Integer.parseInt(sc.nextLine());
                
                switch (valinta) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                            String whatToSay = sc.nextLine();

                            hedgehog.speak(whatToSay);                     
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        hedgehog = new Hedgehog(name, age);

                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int laps = Integer.parseInt(sc.nextLine());

                        hedgehog.run(laps);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte on väärä");
                        break;
                }
            }

        }

        sc.close();
        
    }
}
