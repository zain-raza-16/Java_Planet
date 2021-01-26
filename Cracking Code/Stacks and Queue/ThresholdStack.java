public class ThresholdStack {
   int threshold = 3;
   int[][] arrayOfStacks = new int[5][threshold];
   int[] topPointer = {0,-1}; // Stack,indexInStack
    int stackIndexMax = threshold - 1;

   public void push() {
       if (topPointer[0] == 4 && topPointer[1] == stackIndexMax) {
           System.out.println("Stack is Full");
       }
       else{

           }
       }


   public boolean empty(){
       if (topPointer[0] == 0 && topPointer[1] == -1) return false;
       return true;
   }

   public static void main(String[] args){
       ThresholdStack biach = new ThresholdStack();
       biach.push();
   }

}