import java.util.Scanner;

public class Calculette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez moi le premier nombre à additioner SVP !");

        //on recupere la saisie de l utilisateur
        int nombre1 = sc.nextInt();
        System.out.println(nombre1);

        System.out.println("Donnez moi le deuxieme nombre à additioner SVP !");
        int nombre2 = sc.nextInt();
        System.out.println(nombre2);

        System.out.println(" Le resultat de l'addition est!");

        System.out.println(nombre1 + nombre2);
    }
}