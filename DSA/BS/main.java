public class main{
    public static void main(String[] args) {
        int [] nums ={22,1,66,99,2,62,11};
        int target = 1;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search int the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target ){
        if(arr.length == 0){
            return -1 ;
        }

        // run a for loop
        for(int index = 0 ; index < arr.length; index++ ){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        // this line will excute if none of the return statment above have exceuted
        // hence the target will not found
        return -1;
    }

}