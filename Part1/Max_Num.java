package Part1;

class Max_Num {
    public static void main(String[] args) {
        int arr[] ={12,3,4,5,4,3,3,23,32,3};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}