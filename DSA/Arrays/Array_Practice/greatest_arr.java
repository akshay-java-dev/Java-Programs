public class greatest_arr {
    public static void main(String[]args){
        int arr[]={1,2,44,66,77,88};
        int max= 0;
        for(int element : arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The Maximum value of the array is:-"+max);
    }
    
}
