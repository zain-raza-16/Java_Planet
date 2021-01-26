import java.lang.constant.Constable;

public class SimpleStack {
    int pointerIndex = -1;
    int[] theArray ;
    int maxIndexPossible;

    public SimpleStack(int inputSize){
        theArray = new int[inputSize];
        this.maxIndexPossible = inputSize - 1;
    }

    public void add(int value) throws ArrayIndexOutOfBoundsException {
        if (pointerIndex == maxIndexPossible) throw new ArrayIndexOutOfBoundsException();
        else {
            pointerIndex++;
            theArray[pointerIndex] = value;
        }

    }

    public int pop()throws ArrayIndexOutOfBoundsException{
        int output ;
        if (pointerIndex == -1) throw new ArrayIndexOutOfBoundsException();
        else {
            output = theArray[pointerIndex];
            theArray[pointerIndex] = 0;
            pointerIndex--;
        }
        return output;
    }

    public int peek() {

        if (pointerIndex == -1) System.out.println("String is empty");
        return theArray[pointerIndex];
        }
    }

