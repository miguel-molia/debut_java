public class TableauAleatoire {

    public static void main(String[] args) {
        int tableau[] = new int[100];
        int note = 0;
        int additionNotes = 0;
        int moyenneGenerale = 0;
        for (int i = 0; i < 100; i++) {
            note = (int) (Math.random() * 20 + 1);
            tableau[i] = note;
            System.out.println(note);
            // on additionne toutes les notes qui sortent dans la variable additionNotes
            additionNotes = additionNotes + note;
        }
// calcul de la moyenne
        moyenneGenerale = additionNotes / 100;
        System.out.println("la moyenne generale est de " + moyenneGenerale);
    }
}
