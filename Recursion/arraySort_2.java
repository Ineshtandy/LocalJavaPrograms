public static boolean isSortedBetter(int arr[],int si){
    if(si==arr.length-1){
        return true;
    }
    
    if(arr[si]>arr[si+1]){
        return false;
    }
    
    boolean isSmallerSorted=isSortedBetter(arr,si+1);
    return isSmallerSorted;
}