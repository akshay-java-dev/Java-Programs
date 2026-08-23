public class Mismatch {
    public static void main(String[]args){

    }
    static void Mismatch(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++)

        }
}
