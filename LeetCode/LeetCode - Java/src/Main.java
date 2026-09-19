public class Main{
    public static void main(String[] args) {
        int[] input = { 4 , 5 , 7 , 1};
        for ( int i = 1 ; i < input.length ; i++ ) {
            int key = input[i];
            int j = i - 1;
            while ( j >= 0 && input[j] > key ) {
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = key;
        }
        for (int x : input ) {
            System.out.print(x + " ");
        }
    }
}