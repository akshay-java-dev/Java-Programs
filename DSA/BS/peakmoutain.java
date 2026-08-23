public class peakmoutain{
    public static void main(String[]args){
        int[] arr = {0,2,4,6,8,5,3,1};
        peakmoutain p = new peakmoutain();
        int result = p.PeakIndexInMounatin(arr);
        System.out.println("Peak Index: " + result);
        System.out.println("Peak Value: " + arr[result]);

    }
    public int PeakIndexInMounatin(int[]arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
            // you are in dec part of array
            // this may be the ans,but look at left
            // this is why end != mid -1
            end = mid;
        }else{
            // you are in asc part of array
            start = mid + 1; // because we know that mid + 1 element > mid element
        }
    }
    // int end, start == end and pointing to the largest number because of the 2 check above
    // start and end are alwasys trying to find max element in the above 2 checks
    // hence when they are pointing to just one element that is the max one because that is what the checks says
    // more elaboration at every point of time for start and end, they have the best possible answer till that time 
    // and if we are saying that only one team  is remaining, hence cuz of above line that is the best possible ans
return start; // or return end as both are =
}
}
