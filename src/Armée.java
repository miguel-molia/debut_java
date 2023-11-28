import java.util.Scanner;

public class Armée {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Bienvenue dans le programme de recrutement de l'armée !");
        System.out.println("-------------------------------------------------------");
        System.out.println(" Quel est ton poids ?");
        // on recupere  le poids saisi de l'utilisateur
        int poids = sc.nextInt();
        // on recupere la taille saisie par l'utilisateur
        System.out.println("Quel est ta taille  en centimetres ? ");
        int taille = sc.nextInt();
        System.out.println("Quel est ton age ?");
        // on recupere l'age saisi par l'utilisateur
        int age = sc.nextInt();
        //si poids plus petit que 100 et taille plus grande que 160 et age plus petit que 25
        if (poids < 100 && taille > 160 && age < 25) {
            // on affiche accepté
            System.out.println(" accepté !");
        } else
            //sinon on affiche refusé
            System.out.println("refusé");
    }
}
