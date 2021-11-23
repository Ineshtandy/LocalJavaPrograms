public static boolean checkNumber(int input[], int x) {
		
	if(input.length==1){
            return input[0]==x;
        }
        int smallerArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallerArray[i-1]=input[i];
        }
        if(input[0]==x){
            return true;
        }
    
        boolean presentInSmallerArray=checkNumber(smallerArray,x);
        return presentInSmallerArray;
   }