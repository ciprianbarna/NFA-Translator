import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Automata automata;
        Scanner sc = new Scanner(System.in);

        int states;
        String[] alphabet;
        int initialState;
        String[] aux;
        int [] finalStates;
        int N;
        int[][] transition;

        /*
        We read the input from the file.
        As it's a specific input, the automata won't work
        if the .txt file has'nt have the addecuate format.
         */
        states = sc.nextInt();
        sc.nextLine();
        alphabet = sc.nextLine().split(" ");
        initialState = sc.nextInt();
        sc.nextLine();

        aux = sc.nextLine().split(" ");

        finalStates = new int[aux.length];
        for (int i=0; i< aux.length; i++){
            finalStates[i] = Integer.parseInt(aux[i]);
        }

        N = sc.nextInt();
        sc.nextLine();

        transition = new int[states][alphabet.length];
        for (int i=0; i<states; i++){
            for (int j=0; j<alphabet.length; j++){
                transition[i][j] = sc.nextInt();
            }
        }

        //We build the automata
        automata = new Automata (states, alphabet, initialState, finalStates, transition);

        automata.printAutomata();



    }

    public static void readAutomata(Automata automata){

    }
}
