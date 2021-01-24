public class ThreeStacksInOneArray {
    int capacityPerArray;
    int[][] pointer = new int[3][3];
    int[] stackArray;

    public ThreeStacksInOneArray(int input){
        capacityPerArray = input;
        pointer[0][0] = -1;
        pointer[1][0] = capacityPerArray - 1 ;
        pointer[2][0] = capacityPerArray + capacityPerArray - 1 ;
        this.stackArray = new int[capacityPerArray * 3];
        // refers to the pointer MAX And Min
         int stackOneMin = -1;int stackOneMax = capacityPerArray - 1  ;
         int stackTwoMin = capacityPerArray - 1 ; int stackTwoMax = capacityPerArray * 2 -1;
         int stackThreeMin = capacityPerArray * 2 - 1  ; int stackThreeMax = capacityPerArray * 3 -1;
         pointer[0][1] = stackOneMin;pointer[0][2] = stackOneMax;
        pointer[1][1] = stackTwoMin;pointer[1][2] = stackTwoMax;
         pointer[2][2] = stackThreeMax;pointer[2][1] = stackThreeMin;

    }

    public void push (int stackNum, int value ) throws Exception {
        if (pointer[stackNum][0] == pointer[stackNum][2]){ throw new Exception();}
        else {
            pointer[stackNum][0] += 1;
            stackArray[pointer[stackNum][0]] = value;
//            if (pointer[stackNum][0] != pointer[stackNum][2] )
        }
    }

    public int pop (int stackNum) throws Exception {
        if (pointer[stackNum][0] == pointer[stackNum][1]){ throw new Exception();}
        else {
            int value = stackArray[pointer[stackNum][0]];
            stackArray[pointer[stackNum][0]] = 0;
            pointer[stackNum][0] -= 1;
            return value;
        }
    }
    public static void main(String[] args) throws Exception {
        ThreeStacksInOneArray hello = new ThreeStacksInOneArray(3);
        hello.push(0,6);
        hello.push(0,8);
        hello.push(0,9);

        hello.push(1,3);
        hello.push(2,99);

        hello.pop(1);
        hello.pop(0);
        hello.pop(0);
        hello.pop(2);
        hello.pop(0);

    }
}

