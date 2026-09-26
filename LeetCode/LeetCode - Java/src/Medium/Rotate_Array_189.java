package Medium;

public class Rotate_Array_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if ( n == 1 ) return;
        int[] arr = nums.clone();
        k = k % n;
        if ( k == 1 ) return;
        for ( int i = 0 ; i < n ; i++ ) {
            nums[(i+k) % n] = arr[i];
        }
    }
}
