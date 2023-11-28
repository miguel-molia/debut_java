public class Chrono {

    public static void main(String[] args) {

        //  on declare 3 variable de type long

        long tempsDebut;
        long tempsFin;
        long dureeTotale;
        // on recupere une valeur en millisecondes  dans la variable tempDebut
        tempsDebut = System.currentTimeMillis();
        // puis on l'affiche
        System.out.println(tempsDebut);
        // je lance ma boucle for qui vas m afficher 3000 poney
        for (int i=1;i<3001;i++) {
            System.out.println("Poney numéro "+i);
        }
        // on recupere une valeur en millisecondes  dans la variable tempsFin
        tempsFin = System.currentTimeMillis();
        // on l'affiche
        System.out.println(tempsFin);
        // dans dureeTotale on vas affecter le resultat de tempsFin - TempsDebut qui nous donne la durée en
        // millisecondes du programme
        dureeTotale = tempsFin-tempsDebut;
        // puis on l'affiche
        System.out.println("Le programme à donc mis "+dureeTotale+" millisecondes pour s'executer");
    }
}