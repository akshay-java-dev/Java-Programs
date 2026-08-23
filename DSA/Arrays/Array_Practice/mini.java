public class mini {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 33, 55, 66, 111 };
        int mini = arr[0];   // ✅ start with first element

        for (int e : arr) {
            if (e < mini) {
                mini = e;
            }
        }

        System.out.println("The minimum value is: " + mini);
    }
}
