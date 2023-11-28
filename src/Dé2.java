public class Dé2 {

    public static void main(String[] args) {

        // on declare une variable de type int qu'on initialise à 0 pour notre dé
        int de = 0;
        long tempsDebut;
        long tempsFin;
        long dureeTotale;
        // on declare une variable compteur qui vas compter le nombre de jets de dé
        long compteur = 0;

        // on recupere une valeur en millisecondes  dans la variable tempDebut
        tempsDebut = System.currentTimeMillis();
        // puis on l'affiche
        System.out.println(tempsDebut);

        // tant que de est different de 6 je repart dans le bloc d'instruction
        while (de != 6) {

            // j'affecte à de une valeur entre 1 et 3000
            de = (int) (Math.random() * 3000 + 1);
            //je l'affiche
            System.out.println(de);
            // à chaque jet de dé ( donc tour de boucle while ) on incremente la variable compteur de 1
            compteur = compteur + 1;
        }
        // on recupere une valeur en millisecondes  dans la variable tempsFin
        tempsFin = System.currentTimeMillis();
        // on l'affiche
        System.out.println(tempsFin);
        // dans dureeTotale on vas affecter le resultat de  (tempsFin - TempsDebut) dans dureeTotale qui nous donne la durée en millisecondes du programme
        dureeTotale = tempsFin - tempsDebut;
        // puis on l'affiche
        System.out.println("Le programme à donc mis " + dureeTotale + " millisecondes pour s'executer");
        // on affiche le nombre de jet de dé
        System.out.println("Le dé à ete jeté " + compteur + " fois");

    }
}