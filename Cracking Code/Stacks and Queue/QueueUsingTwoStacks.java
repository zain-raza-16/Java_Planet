public class QueueUsingTwoStacks {
    SimpleStack sOne;
    SimpleStack sTwo;

    public QueueUsingTwoStacks(int queueSize){
        sOne = new SimpleStack(queueSize);
        sTwo = new SimpleStack(queueSize);
    }

    public void add (int value){
        while(sTwo.pointerIndex != -1){
            int changingValue = sTwo.pop();
            sOne.add(changingValue);
        }
        sOne.add(value);
    }

    public int pop (){
        while(sOne.pointerIndex != -1){
            int changingValue = sOne.pop();
            sTwo.add(changingValue);
        }
        return sTwo.pop();
    }

    public static void main(String[] args){
        QueueUsingTwoStacks hello = new QueueUsingTwoStacks(10);
        hello.add(5);
        hello.add(6);
        hello.add(8);
        System.out.println(hello.pop());
        System.out.println(hello.pop());
        System.out.println(hello.pop());

    }

}
