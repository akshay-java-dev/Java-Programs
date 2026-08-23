public class sumof_array {
    public static void main(String[]args){
        float a[] ={1.2f,1.3f,1.4f,1.5f,1.6f};
        /*float sum = 1.2f+1.3f+1.4f+1.5f+1.6f;
        System.out.println(sum);
        */
        float sum = 0;
        for(float num : a){
            sum = sum + num;
        }
        System.out.println(sum);




    }
    
}
