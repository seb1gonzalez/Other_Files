/**
 * Created by sebas_000 on 3/28/2017.
 */
public class ImitiationGame { //just noticed there is a typo in "imitation"
    public static void main(String [] args){
        int [][] symbol = new int[6][3];
        int [][] state = new int[6][3];
        char [][] lr = new char[6][3];

        int []tape = {1,1,1,1,1,1,0};


        //------------RULES------//
        //start, _ --> inNumber, R
        state[0][0] = 1; symbol[0][0] = 1; lr[0][0]='R';
        //inNumber, 1 --> state1, R
        state[1][2] = 2; symbol[1][2] = 2; lr[1][2] = 'R';
        //inNumber, _ --> reject
        state[1][0]= 5; symbol[1][0]=5;lr[1][0] ='_';
        //inNumber, 0 --> state0, R
        state[1][1]=2; symbol[1][1]=2;lr[1][1]='R';
        //state0, 1 --> state1, R
        state[3][2]=3; symbol[3][2]=3; lr[3][2]='R';
        //state0, 0 --> state0, R
        state[3][1]=3; symbol[3][1]=3;lr[3][1]='R';
        //state1, 1 --> state1, R
        state[2][2]=2; symbol[2][2]=2;lr[2][2]='R';
        //state1, 0 --> state0, R
        state[2][1]=3; symbol[2][1]=3;lr[2][1]='R';
        //state1, _ --> reject
        state[2][0]=5; symbol[2][0]=5;lr[2][0]='_';
        //state0, _ --> accept
        state[3][0]=4; symbol[3][0]=4;

turing(6,state,symbol,lr,tape);
    }
    public static void turing(int N,  int[][] state, int[][]symbol,char[][]lr, int[] tape){
        int head  = 0;
        int currentState = 0;
        int nextState;
        int curSymbol = tape[head];
        int nextSymbol;
        while(currentState!=(N-1) && currentState!=(N-2)){
            nextState=state[currentState][tape[head]];
            nextSymbol = symbol[currentState][curSymbol];
            char direction = lr[currentState][curSymbol];
            tape[head] = nextSymbol;
            currentState=nextState;
            if(direction =='R'){
                head++;
            }
            else if(direction == 'L'){
                head--;
            }
            else{
                System.out.println("rejected");
                return;
            }
        }
        System.out.println("Accepted");
        for (int i=0;i<tape.length;i++) {

            System.out.println("[ "+tape[i]+" ]");
        }
//output always shows "rejected" or "array out of bounds"//

    }
}