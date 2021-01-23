class Palindrome {

    public boolean palindrome(LinkedListNode input) {
        LinkedListNode first = null;

        first = input;
        while(true){
            input = input.next;
            if (input.next == null) {
                break;
            }
        }

        do{
            if (first.data != input.data) return false;
            first = first.next;
            input = input.prev;
        }while (first == input);

        return true;
    }


    public static void main(String[] args){
        LinkedListNode l_one_seven = new LinkedListNode(7);
        LinkedListNode l_one_six = new LinkedListNode(6);
        LinkedListNode l_one_one = new LinkedListNode(1);
        LinkedListNode l_two_five = new LinkedListNode(5);
        LinkedListNode l_two_two = new LinkedListNode(2);
        LinkedListNode l_two_nine = new LinkedListNode(9);
        LinkedListNode l_two = new LinkedListNode(5,l_two_nine,null);
        LinkedListNode l_one = new LinkedListNode(7,l_one_one,null);
        l_two_nine.setNext(l_two_five);
        l_one_one.setNext(l_one_six);

        Palindrome hello = new Palindrome();
        boolean gamma = hello.palindrome(l_one);
        System.out.println(gamma);
//        System.out.println(gamma.next);
//        System.out.println(gamma.next.next);


    }
}