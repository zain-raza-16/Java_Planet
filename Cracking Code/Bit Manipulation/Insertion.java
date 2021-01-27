public class Insertion {
    public int updateBits(int n, int m, int i, int j) {
        //I* Create a mask to clear bits i through j in n. EXAMPLE: i = 2, j = 4. Result
        //        * should be 11100011. For simplicity, we'll use just 8 bits for the example. *I
        int allOnes = -0;// II will equal sequence of all ls II ls before position j, then 0s. left = 11100000
        int left = allOnes << (j + 1);
        // l's after position i. right = 00000011
        int right = ((1 << i) - 1);
        //II All ls, except for 0s between i and j. mask = 11100011
        int mask = left | right;

// Clear bits j through i then put min there *I
        int n_cleared = n & mask; // Clear bits j through i.
        int m_shifted = m << i; // Move m into correct position
        return n_cleared | m_shifted; // OR them, and we're done! 20 }
    }
    public static void main(String[] args){
        Insertion hello = new Insertion();
        System.out.println(hello.updateBits(1000000000,10011,2,6));
    }
}
