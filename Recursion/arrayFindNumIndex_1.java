public static int firstIndex(int input[], int x) {
	if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }
        
        int smallerArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallerArray[i-1]=input[i];
        }
        
        int fi=firstIndex(smallerArray,x);
        if(fi==-1){
            return -1;
        }
        else{
            return fi+1;
        }
    }