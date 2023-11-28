import java.util.Scanner;

public class DéExo {

    public static void main(String[] args) {

        int d1 = (int) (Math.random() * 10 + 1);


        Scanner sc = new Scanner(System.in);

        System.out.println("Donnes moi le chiffre du dé");

        //on recupere la saisie de l utilisateur
        int choice1 = sc.nextInt();

        while (d1!=choice1) {
            System.out.println("Faux, le résultat était "+d1);

            System.out.println("On relance les dés, re éssayes");

            d1 = (int) (Math.random() * 10 + 1);


            choice1 = sc.nextInt();
        }

        System.out.println("Vrai, le résultat était "+d1);
    }
}

