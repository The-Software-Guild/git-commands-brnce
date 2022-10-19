package com.sg.foundations.scanner;


import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String [] args) {

        Scanner inputReader = new Scanner(System.in);
        String noun1, noun2, adj1, adj2, pluralNoun1, pluralNoun2, pluralNoun3, presentVerb, pastVerb;
        int num1;

        System.out.println("I need a noun:");
        noun1 = inputReader.nextLine();

        System.out.println("Now an adjective:");
        adj1 = inputReader.nextLine();

        System.out.println("Another noun:");
        noun2 = inputReader.nextLine();

        System.out.println("And a number:");
        String numPar = inputReader.nextLine();
        num1 = Integer.parseInt(numPar);

        System.out.println("Another adjective:");
        adj2 = inputReader.nextLine();

        System.out.println("A plural noun:");
        pluralNoun1 = inputReader.nextLine();

        System.out.println("Another one:");
        pluralNoun2 = inputReader.nextLine();

        System.out.println("One More:");
        pluralNoun3 = inputReader.nextLine();

        System.out.println("A verb (infinitive form):");
        presentVerb = inputReader.nextLine();

        System.out.println("Same verb (past participle):");
        pastVerb = inputReader.nextLine();

        System.out.println(noun1 + ": the " + adj1 + " frontier." +
                "These are the voyages of the starship" + " " +
                noun2 + "." + "Its" + " " + num1 + "-year mission: to explore strange "
                + adj2 +  " " + pluralNoun1 + ", to seek out " + adj2 + " " + pluralNoun2 +
                " and" + " " + adj2 + " " + pluralNoun3 + ", to boldly" + " " + presentVerb +
                " where no one has" + " " + presentVerb + " " + pastVerb + " before.");
    }

}
