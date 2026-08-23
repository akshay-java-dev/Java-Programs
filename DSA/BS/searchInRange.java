public class searchInRange{
    public static void main(String[]args){
        int[]arr = {3,-1,33,18,77,8};
        int target = 77;
        System.out.println(LinearSearchInRange(arr, target,1,4));

    }
    static int LinearSearchInRange(int []arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index<= end; index ++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}