import java.lang.Math;
public class MinimalTree {
    Node rootNode ;

    public Node giveBinaryTree(int[] input){
        int startIndex = 0;
        int endIndex = input.length - 1;
        rootNode = new Node(input[(endIndex + startIndex)/2]) ;
        recursiveRun(input, startIndex, ((endIndex + startIndex)/2) - 1, rootNode);
        recursiveRun(input, ((endIndex + startIndex)/2) + 1, endIndex, rootNode);
        return rootNode;
    }

    private void recursiveRun (int[] input, int startIndex, int endIndex,Node parentNode) {
        if(startIndex <= endIndex) {
        Node middle = new Node(input[(startIndex + endIndex) / 2]);
        if (middle.data <= parentNode.data ) {
            parentNode.left = middle;
        } else {
            parentNode.right = middle;
        }
            if (startIndex != endIndex) {
                recursiveRun(input, startIndex, ((endIndex + startIndex) / 2) - 1, middle);
                recursiveRun(input, ((endIndex + startIndex) / 2) + 1, endIndex, middle);
            }
        }
    }


    public static void main(String[] args){
        MinimalTree hello = new MinimalTree();
        int[] anna = {1,2,3,4,5,6,7,8,9};
        hello.giveBinaryTree(anna);
        System.out.println(hello.rootNode.data);
        System.out.println(hello.rootNode.left.data);
        System.out.println(hello.rootNode.left.left.data);
        System.out.println(hello.rootNode.left.right.data);
        System.out.println(hello.rootNode.left.right.right.data);
        System.out.println(hello.rootNode.right.data);
        System.out.println(hello.rootNode.right.right.data);
        System.out.println(hello.rootNode.right.right.right.data);
        System.out.println(hello.rootNode.right.left.data);

    }
}
