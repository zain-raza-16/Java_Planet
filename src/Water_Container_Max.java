
import java.util.Arrays;

class Water_Container_Max {
    int maxForArea = 0;
    public int maxArea(int[] input) {

        for ( int w = 0 ; w < input.length; w ++){
            int maxForElement = 0;
            for(int i = input.length - 1; i >= 0 ; i--){
                if (input[w] <= input[i]) {
                    if ((i * (input[w]) > maxForElement)) {
                        maxForElement = (i-w) * input[w];
                    }
                }
                else if ( input[i] < input[w] ){
                    if ((input[i]* i) > maxForElement){
                        maxForElement = input[i]* (i-w);
                    }
                }
                if (maxForElement > maxForArea) maxForArea = maxForElement;
                if( input[i] > input[w] ) {
                    break;
                }
                if (Arrays.stream(input).max().getAsInt() <= i) {
                    break;
                }


            }
        }
        return maxForArea;

    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Water_Container_Max mega = new Water_Container_Max();
        System.out.println(mega.maxArea(height));


    }
}