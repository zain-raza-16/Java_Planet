public class Node {
    Node right;
    Node left;
    int data;

    public Node(int givenData, Node left , Node right){
        data = givenData;
        this.left = left;
        this.right = right;
    }

    public Node(int givenData){
        data = givenData;
        right = null;
        left = null;
    }

}
