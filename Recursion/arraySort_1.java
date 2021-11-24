public static boolean isSorted(int arr[]){
	if(arr.length==1 || arr.length==2){
	    return true;
	}
	
	if(arr[0]>arr[1]){
	    return false;
	}
	
	int smallerarr[]=new int[arr.length-1];
	for(int i=1;i<arr.length;i++){
	    smallerarr[i-1]=arr[i];
	}
	
	boolean smallerarrSorted=isSorted(smallerarrSorted);
	return smallerarrSorted;
}
