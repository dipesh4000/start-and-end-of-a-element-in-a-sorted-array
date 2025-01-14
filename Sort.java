public class Sort {
    public static void main(String[] args) {

        int[] col = {3, 2, 1, 0, 4, 5, 8, 2, 0};
        System.out.println(canjump(col));


    }
    public static boolean canjump(int[] nums) {
        int n = nums.length;
        int j = 1;
        while(j<n){
            j += nums[j];
            if(j == n-1){
                return true;
            }
            if(nums[j] == 0 ){
                return false;
            }
        }
        return false;




    }
}
