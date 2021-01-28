import java.util.ArrayList;

public class ListOfDepths {
    ArrayList<LinkedListNode> result = new ArrayList<>();
    public ArrayList<LinkedListNode> createMagic (Node mainNode){

        LinkedListNode begin = new LinkedListNode(-1);
        recursiveRun(mainNode,begin);

        return result;
    }

    private void recursiveRun(Node middleNode,LinkedListNode begin){
        if (middleNode.left != null) {
            LinkedListNode alpha = new LinkedListNode(middleNode.data);
            begin.setNext(alpha);
            recursiveRun(middleNode.left, begin.next);
        }
        if (middleNode.right != null) {
            LinkedListNode newBranch = begin.cloneBack();
            LinkedListNode gamma = new LinkedListNode(middleNode.data);
            newBranch.setNext(gamma);
            recursiveRun(middleNode.right, newBranch.next);
        }
        if (middleNode.left  == null && middleNode.right == null){
            LinkedListNode beta = new LinkedListNode(middleNode.data);
            begin.setNext(beta);
            result.add(beta);
        }

    }

    public static void main(String[] args) {
        MinimalTree hello = new MinimalTree();
        int[] anna = {1,2,3,4,5,6,7,8,9};
        Node question = hello.giveBinaryTree(anna);
        ListOfDepths amazing = new ListOfDepths();
        ArrayList<LinkedListNode> really = amazing.createMagic(question);

        LinkedListNode mommy = really.get(0);
        System.out.println(mommy);
        System.out.println(mommy.prev);
        System.out.println(mommy.prev.prev);
        System.out.println(mommy.prev.prev.prev);

        LinkedListNode dad = really.get(1);
        System.out.println(dad);
        System.out.println(dad.prev);
        System.out.println(dad.prev.prev);
        System.out.println(dad.prev.prev.prev);
        System.out.println(dad.prev.prev.prev.prev);

        LinkedListNode biya = really.get(2);
        System.out.println(biya);
        System.out.println(biya.prev);
        System.out.println(biya.prev.prev);
        System.out.println(biya.prev.prev.prev);

        LinkedListNode appi = really.get(3);
        System.out.println(appi);
        System.out.println(appi.prev);
        System.out.println(appi.prev.prev);
        System.out.println(appi.prev.prev.prev);
        System.out.println(appi.prev.prev.prev.prev);





    }

}
