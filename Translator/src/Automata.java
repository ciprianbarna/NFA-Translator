

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
        int currentState = initialState;
        int wordIn;
        int reader=0;
        int del=0;
        int i=0;
        String translation= "";
        int aux[] = new int[] {0,0};
        boolean stop = false;
        boolean isFinalState = false;

        while(reader < input.length() && !stop){

            if(input.charAt(reader) == 'a'){wordIn=0;} else{wordIn=1;}

            if(transitions[currentState][wordIn]>=0){
                if(del <= N){

                    if(wordIn==0){//si es a

                        if(aux[0] == 0){
                            aux[0]++;
                        }
                        else{
                            translation = translation + input.charAt(reader);
                        }
                    }
                    else{

                        if(aux[1] == 0){
                            aux[1]++;
                        }
                        else{
                            translation = translation + input.charAt(reader);
                        }
                    }

                    if(aux[0] == 1 && aux[1] == 1){aux[0]=0;aux[1]=0;del++;}

                }else {translation = translation + input.charAt(reader);}

                currentState= transitions[currentState][wordIn];
                reader++;

            } else{
                stop = true;
            }

        }

        if (stop){
            translation = "";
        } else {

            if(aux[0] == 1 ){translation = translation +"a";}
            else if(aux[1] == 1){translation = translation +"b";}



            while(!isFinalState && i<finalStates.length){
                if(currentState == finalStates[i]){
                    isFinalState = true;
                }
                else {
                    i++;
                }
            }
            if(!isFinalState){translation = "";}
        }

        return translation;
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
