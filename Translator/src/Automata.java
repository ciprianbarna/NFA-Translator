

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
        int i= initialState, j, reader=0,del=0,m=0; // i= estado ; j= a/b ; reader for reading the input
        String res= "";
        int aux[] = new int[] {0,0};
        boolean stop = false;
        while(reader < input.length() && !stop){ //recorre la matriz de transiciones hasta que se acabe la palabra o hasta que se detecte que la palabra no es valida
            if(input.charAt(reader) == 'a'){j=0;} else{j=1;}//selecciona si es a o b
            if(transitions[i][j]>=0){
                if(del<N){
                    if(j==0){//si es a
                        if(aux[0] == 0){
                            aux[0]++;
                        }
                        else{
                            res = res + input.charAt(reader);
                        }
                    }
                    else{
                        if(aux[1] == 0){
                            aux[1]++;
                        }
                        else{
                            res = res + input.charAt(reader);
                        }
                    }
                    if(aux[0] == 1 && aux[1] == 1){aux[0]=0;aux[1]=0;del++;}
                }else {res = res + input.charAt(reader);}

                i= transitions[i][j];
                reader++;
            }
            else{
                stop = true;
                res= "";
            }

        }
        if(aux[0] == 1 ){res = res +"a";}
        else if(aux[1] == 1){res = res +"b";}
        boolean fs = false;
        while(!fs && m<finalStates.length){
            if(i == finalStates[m]){
                fs = true;
            }
            else {
                m++;
            }
        }
        if(!fs){res = "";}
        return res;
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
