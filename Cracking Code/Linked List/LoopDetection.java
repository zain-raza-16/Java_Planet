public class LoopDetection {

    public LinkedListNode solution(LinkedListNode startingPoint){
        startingPoint.visted = true;
        while(true){
            startingPoint = startingPoint.next;
            if (startingPoint.visted){
                return startingPoint;
            }

        }
    }

    public static void main(String[] args) {
        LinkedListNode one = new LinkedListNode(1);
        LinkedListNode o2 = new LinkedListNode(2);
        LinkedListNode o3 = new LinkedListNode(3);
        LinkedListNode o4 = new LinkedListNode(4);
        LinkedListNode o5 = new LinkedListNode(5);
//        LinkedListNode o6 = new LinkedListNode(6);
//        LinkedListNode o7 = new LinkedListNode(7);
//        LinkedListNode o = new LinkedListNode(8);
        one.setNext(o2);
        o2.setNext(o3);
        o3.setNext(o4);
        o4.setNext(o5);
        o5.setNext(one);

        LoopDetection hello = new LoopDetection();
        System.out.println(hello.solution(one));
        System.out.println(hello.solution(o2));
        System.out.println(hello.solution(o3));
        System.out.println(hello.solution(o4));
        System.out.println(hello.solution(o5));




    }

}
