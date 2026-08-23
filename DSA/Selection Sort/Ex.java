import java.util.Arrays; 
public class Ex {
    public static void main(String[]args){
        int[]arr = {7,3,2,6,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr){
        for(int i = 0 ; i < arr.length; i++){
            // find the maximum element in the unsorted part of array
            int last = arr.length - i -1;
            int MaxIndex = getMaxIndex(arr,0,last);
            swap(arr,MaxIndex,last);
        }
    }
    static void swap(int[]arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[]arr,int start,int end){
        int max = start;
        for(int i =start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}    
