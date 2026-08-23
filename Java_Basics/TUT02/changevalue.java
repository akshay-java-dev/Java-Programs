import java.util.Arrays;
public class changevalue {
    public static void main(String[] args) {

        int arr[] = {1, 3, 55, 88};

        change(arr);   // function call

        // printing changed array
        System.out.println(Arrays.toString(arr));
    }

    static void change(int nums[]) {
        nums[0] = 99;
    }
}