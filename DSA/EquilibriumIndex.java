public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index: " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No equilibrium index");
    }
}
