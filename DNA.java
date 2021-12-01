import java.util.Arrays;

public class DNA {
    public static void main(String[] args) {
        String dna;
        String[] dnaList = { "ATGCGATACGCTTGA", "ATGCGATACGTGA", "ATTAATATGTACTGA", "ATGCTAGTTAGCTTATGA"};

        for (int i = 0; i < dnaList.length; i++) {

            dna = dnaList[i];

            System.out.println("Length is:" + dna.length());

            int start = dna.indexOf("ATG");
            System.out.println("Start: " + start);

            int stop = dna.indexOf("TGA");
            System.out.println("Stop: " + stop);

            if ( start != -1 && stop != -1 && (stop - start) % 3 == 0) {
                System.out.println("Conditions met " + dna + " is a protein");
            } else {
                System.out.println( dna + " is not a protein");
            }
        }
    }
}
