package Homework1;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        System.out.println("Labdien Chatbot programmā! \n Kāds ir Jūsu jautājums?");
        while (true) {
            Scanner ievade = new Scanner(System.in);
            String jautajums = ievade.nextLine();
            if (jautajums.toLowerCase().contains("vārds")) {
                System.out.println("Mani sauc Chatbot");
                ievade.close();
            } else if (jautajums.toLowerCase().contains("vecums")) {
                System.out.println("Man nav vecuma esmu Chatbot \n Nākamais jautājums?");
            } else if (jautajums.toLowerCase().contains("tautība")) {
                System.out.println("Man nav tautības esmu digitāls");
            } else if (jautajums.toLowerCase().contains("dzīvo")) {
                System.out.println("Latvijā");
            } else if (jautajums.toLowerCase().contains("saldumi")) {
                System.out.println("Man garšo šokolāde");
            } else if (jautajums.toLowerCase().contains("dirst")) {
                System.out.println("Rupjības nav smuki, uzredzēšanos!");
                break;
            } else if (jautajums.toLowerCase().contains("fuck")) {
                System.out.println("Rupjības nav smuki, uzredzēšanos!");
                break;
            } else {
                System.out.println("Lūdzu atkārto jautājumu nav skaidrs, esmu jauns Chatbot šobrīd varu atbildēt tikai uz šādiem jautājumiem: \n 1) Kā mani sauc? \n 2) Kāds ir mans vecums? \n 3) Kāda ir mana tautība? \n 4) Kur es dzīvoju? \n 5) Kādi saldumi man garšo ? \n Jautājums?");
            }
        }
    }
}

