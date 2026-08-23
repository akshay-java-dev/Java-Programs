public class C1{
    public static void main(String[]args){
        int [] arr = {33,11,55,88,99,34,45};
        int target = 11;

        int result = C2(arr,target);
        if(result < arr.length){
            System.out.println("Ceiling Index" + result);
            System.out.println("Ceiling Value" +arr[result]);
        }
    }
    static int C2(int []arr , int target){
        int start = 0;
        int end = arr.length -1;
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start +(end - start) / 2;

            if(target < arr[mid]){
                return mid + 1;
            }else if(target > arr[mid]){
                return mid - 1;
            }else{
                return mid;
            }
        }
        return start;

    }
}