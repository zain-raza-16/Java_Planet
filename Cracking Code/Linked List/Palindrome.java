class Solution_1 {

    public boolean palindrome(LinkedListNode input) {
        LinkedListNode first = null;

        first = input;
        while (true) {
            input = input.next;
            if (input.next == null) {
                break;
            }
        }

        do {
            if (first.data != input.data) return false;
            first = first.next;
            input = input.prev;
        } while (first == input);

        return true;
    }
}
