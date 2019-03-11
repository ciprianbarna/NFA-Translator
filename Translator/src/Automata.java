

public class Automata {
    private int states;
    private String[] alphabet;
    private int initialState;
    private int[] finalStates;
    private int[][] transitions;

    //default constructor with a default Automata
    public Automata(){

    }

    public Automata(int states, String[] alphabet, int initialState, int[] finalStates, int[][] transitions){
        this.states = states;
        this.alphabet = alphabet;
        this.initialState = initialState;
        this.finalStates = finalStates;
        this.transitions = transitions;
    }


    public String translate(String input, int N){

        return "traductor";
    }

    public void printAutomata(){
        System.out.println("Automata Data: ");
        System.out.println("Number of states: " + this.states);
        System.out.print("Alphabet: ");
        for(int i=0; i<alphabet.length; i++) {
            System.out.print(alphabet[i]+ " ");
        }
        System.out.println();
        System.out.println("Initial state: " + this.initialState);
        System.out.print("Final states: ");
        for(int i=0; i<finalStates.length; i++){
            System.out.print(finalStates[i]+" ");
        }
        System.out.println();
        System.out.println("Transition Table: ");
        for (int i=0; i < transitions.length; i++){
            for (int j=0; j<transitions[i].length; j++){
                System.out.print(transitions[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=====================================");

    }
}
