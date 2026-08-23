public class avg_arr {
    public static void main(String[]args){
        int marks[] = {22,88,99,77,66,88};
        float sum = 0.0f;
        for(float element:marks){
            sum = sum+element;
        }
    
    System.out.println("The value of avg:-"+sum/marks.length);
    }
}

