public class SortStack {
    SimpleStack popStack;
    SimpleStack addStack;
    boolean addStackActive = true;
    boolean popStackActive = false;


    public SortStack(int capacity) {
        popStack = new SimpleStack(capacity);
        addStack = new SimpleStack(capacity);
    }

    public void add(int value) {
        // this is for the first value
        if (addStack.pointerIndex == -1 && addStackActive) addStack.add(value);
            // this is for rest of the situations
        else if (addStackActive) {
            // Normal Case , Incoming is greater than present , EASY
            if (addStack.peek() <= value) {
                addStack.add(value);
            }
            // Hard Case , Incoming is less than present , Start Moving Things
            else if (addStack.peek() > value) {

                while (addStack.pointerIndex != -1) {
                    // the Incoming is greator so add it first
                    if (value > addStack.peek()) {
                        popStack.add(value);
                        value = Integer.MIN_VALUE;
                    }
                    // present value is less so add it later
                    else {
                        popStack.add(addStack.pop());
                    }
                }
                addStackActive = false;
                popStackActive = true;
            }
        } else if (popStackActive) {
            // simply add the pending value to the popStack
            if (popStack.peek() >= value) {
                popStack.add(value);
            } else {
                //Shift values around to add stack with reasonable positions
                while (popStack.pointerIndex != -1) {
                    if (popStack.peek() <= value) addStack.add(popStack.pop());
                    else {
                        addStack.add(value);
                        value = Integer.MAX_VALUE;
                    }
                }
                popStackActive = false;
                addStackActive = true;
            }
        }
    }

        public int pop(){
            if (popStackActive) return popStack.pop();
            else {
                while (addStack.pointerIndex != -1) {
                    popStack.add(addStack.pop());
                }
                addStackActive = false;
                popStackActive = true;
                return popStack.pop();
            }
        }
        public static void main (String[]args){
            SortStack hello = new SortStack(5);
            hello.add(3);
            hello.add(4);
            hello.add(5);
            hello.add(10);
            hello.add(7);
            System.out.println(hello.pop());
            System.out.println(hello.pop());
            hello.add(4);
            System.out.println(hello.pop());
            hello.add(6);
            System.out.println(hello.pop());
        }

}
