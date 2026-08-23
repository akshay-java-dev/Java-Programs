public class arr_sort {
    public static void main(String[]args){
        int arr[] = {96,44,88,34,66};
        boolean isSorted = true;
        for(int i =0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }else{
            System.out.println("This array is not sorted");
    }
    
}
}
