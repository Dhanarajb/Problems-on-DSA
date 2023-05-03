package Part1;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,3,4};

        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
}
