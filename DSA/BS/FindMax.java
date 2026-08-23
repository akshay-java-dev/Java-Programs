public class FindMax {
    public static void main(String[] args) {
        int []arr = {11,99,34,2,96};
        System.out.println(Max(arr));
    }
    static int Max(int[]arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
