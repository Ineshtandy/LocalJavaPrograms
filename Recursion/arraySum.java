public static int sum(int input[]) {
	if(input.length==1){
            return input[0];
        }
        int smallerArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallerArray[i-1]=input[i];
        }
        int sumSmallerArray=sum(smallerArray);
        return input[0]+sumSmallerArray;
}