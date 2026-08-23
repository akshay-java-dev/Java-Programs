public class FibonacciNumber {
    public static void main(String[]args){
        System.out.println(Fibo(6));
    }
    static int Fibo(int n){
        // Based condition
        if( n < 2){
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
/* How to Understand  & approach a problem 
1. Identify if you can break down problem into Samller problem
2. Write the recurition relation if needed
3. Draw the recurive tree
4.About the tree
A. see the how of functions , have they getting in stack
B.Identify  & flows or left treee call and right tree calls
c. draw the tree and position again and again using pen & paper
d. use a debugger to see the flow
5. see how values are returned at each step see where two fuction call with come out int the end you will come out of the main fuction
  */
