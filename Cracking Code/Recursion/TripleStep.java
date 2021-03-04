public class TripleStep {
    int count = 0;
    public int solution (int n){
        return findPossibilities(0,n);
    }

    private int findPossibilities(int currentStep , int n ){
        if(currentStep == n) count++;
        if(currentStep + 1 <= n ) findPossibilities(currentStep + 1,n);
        if(currentStep + 2 <= n ) findPossibilities(currentStep + 2,n);
        if(currentStep + 3 <= n ) findPossibilities(currentStep + 3,n);

        return count;
    }
    public static void main(String[] args) {
    TripleStep hello = new TripleStep();
        System.out.println(hello.solution(5));
    }
}
