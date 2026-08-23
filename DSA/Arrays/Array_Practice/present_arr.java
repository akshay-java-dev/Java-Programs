public class present_arr{
    public static void main(String[]args){
        int present[] = {33,44,55,22,55};
        int num = 22;
        boolean isInArray = false; 
        for(int element:present){
            if(num == element){
                isInArray = true;
                break;
            }

        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }else{
            System.out.println("The Value not present in the array");
        }
    }
}