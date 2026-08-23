public class changing {
    // static void change(int a){
    // a = 99;
    static void change(int arr[]) {
        arr[0] = 98;

    }

    public static void main(String[] args) {
        int marks[] = { 55, 66, 77, 88, 99, 33 };
        // case no =1 changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("the value of after changing :-" +x);

        // case no = 2 changing the array

        change(marks);
        System.out.println("the value of after changing :-" + marks[0]);

    }

}
