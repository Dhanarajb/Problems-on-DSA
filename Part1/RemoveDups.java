package Part1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public static void main(String[] args) {
        int arr[] = {2,3,1,3,65,4,3,2,1,3,6,34};
        int n = arr.length;
       Set<Integer> hash_set =  new HashSet<Integer>();
       for(int i=0;i<n;i++){
        hash_set.add(arr[i]);
       }
       System.out.println(hash_set);
       }
    }

