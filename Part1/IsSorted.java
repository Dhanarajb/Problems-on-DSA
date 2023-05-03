package Part1;

public class IsSorted {
    public static boolean main(String[] args) {
        int arr[] = {2,3,1,1,2,3,1};
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
