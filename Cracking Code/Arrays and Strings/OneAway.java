public class OneAway {
    // only when copy is one less in length than orginal
    private boolean insertCheck(String original, String copy) {
        int i = 0;
        int j = 0;
        int lifeline = 2;

        while (lifeline > 0 && i != original.length()) {  // This will create an error
            if (i == j && i == original.length() - 1) return true;
            if (original.charAt(i) != copy.charAt(j)) {
                j--;
                lifeline--;
            }
            i++;
            j++;
        }
        return lifeline > 0;
    }

    //only when orginal and copy are of equal length
    private boolean replaceCheck(String original, String copy) {
        int i = 0;
        int j = 0;
        int lifeline = 2;

        while (lifeline > 0 && i != original.length()) {
            if (original.charAt(i) != copy.charAt(j)) {
                lifeline--;
            }
            i++;
            j++;
        }

        return lifeline > 0;
    }

    //only when copy one more in length than orginal
    private boolean removeCheck(String original, String copy) {
        int i = 0;
        int j = 0;
        int lifeline = 2;
        while (lifeline > 0 && i != original.length()) {
            if (original.charAt(i) != copy.charAt(j)) {
                j++;
                lifeline--;
            }
            i++;j++;
        }
        return lifeline > 0;
    }

    private boolean solution(String original, String copy){
        if (original.length() == copy.length() + 1 )
        {return insertCheck(original,copy);}
        if (original.length() == copy.length()  )
        {return replaceCheck(original,copy);}
        if (original.length() == copy.length() - 1 )
        {return removeCheck(original,copy);}

        return false;
    }
    public static void main(String[] args) {
        OneAway hello = new OneAway();
        System.out.println(hello.solution("pale", "ple"));
        System.out.println(hello.solution("pales", "pale"));
        System.out.println(hello.solution("pale", "bale"));
        System.out.println(hello.solution("pales", "bake"));
    }
}
