//Jonathan Quang
//APCS pd2
//HW06 -- Step 1: Split, Step 2?, Step 3: Sorted!
//2017-02-10


/*======================================
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm: 
  ======================================*/

public class MergeSort {

    public int pass = 0;

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     It works by creating an output array that is of the combined
     length of the two input arrays. There are two integers that keep
     track of the indexes of the two input arrays. What is first checked
     is if one of the array index variables exceeds the size of the array,
     in that case, the number of the other array is used.
     The sum of the two index variables is used to keep track of where
     in the output array should the next number be added to. That is 
     why after a number is added, either indexA or indexB is incremented
     ******************************************************/
    private int[] merge( int[] a, int[] b ) 
    {
	int indexA = 0;
	int indexB = 0;
	int[] outArr = new int[a.length + b.length];
	while (indexA < a.length || indexB < b.length){
	    pass++;
	    if (indexA == a.length){
	        outArr[indexA+indexB]=b[indexB];
		indexB++;
	    }
	    else if (indexB == b.length){
		outArr[indexA+indexB] = a[indexA];
		indexA++;
	    }
	    else if (a[indexA] <= b[indexB]){
		outArr[indexA + indexB] = a[indexA];
		indexA++;
	    }
	    else if (b[indexB] < a[indexA]){
		outArr[indexA+indexB] = b[indexB];
		indexB++;
	    }
	}
	return outArr;
    
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     In summary, this function returns the input array only if
     the input array is of length 1 (indicating that it can no
     longer be split. Otherwise, the input array is split
     into halves as closely as possible. These halves are coined
     leftSideArr and rightSideArr. The key to this function is the 
     recursion statement where you merge the sorted version of the 
     left and right side (merge(sort left),(sort right));
     ******************************************************/
    public  int[] sort( int[] arr) 
    {
	if (arr.length == 1){
	    return arr;
	}
	
	pass++;
	int splitArrayLength = arr.length / 2;
	int[] leftSideArr = new int[splitArrayLength];
	int[] rightSideArr = new int[arr.length - splitArrayLength];

	for (int x = 0; x < splitArrayLength;x++){
	    leftSideArr[x] = arr[x];
	}

       int rightCounter = 0;
       for (int x = splitArrayLength; x < arr.length; x++){
	   rightSideArr[rightCounter] = arr[x];
	   rightCounter ++;
	}

       return merge(sort(leftSideArr),sort(rightSideArr));
	
    }//end sort()


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    //when arrays are passed into the arugment of a function, and
    //the function modifies the array, the array is permenantly modifed
    //arrays are pass by value
    public static void mess( int[] a ) {

	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;

    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


 
    //main method for testing
    public static void main( String [] args ) {



    }//end main()

}//end class MergeSort
