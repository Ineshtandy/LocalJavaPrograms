public static int findIndexBetter(int arr[],int x,int si){
    if(si==arr.length){
        return -1;
    }	
    if(arr[si]==x){
        return si;
    }
    
    int fi=findIndexBetter(arr,x,si+1);
    return fi;
}