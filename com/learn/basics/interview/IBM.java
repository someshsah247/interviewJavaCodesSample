package com.learn.basics.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IBM {

    // merage 2 arrays
    //int[] array1 = {1,2,3}
    //int[] array2 ={4,5,6}
    //o/p : int [] result = {1,2,3,4,5,6}

    private static void joinTwoArrr(int[] arrA, int[] arrB){
        int[] result = Stream.concat(Arrays.stream(arrA).boxed(),Arrays.stream(arrB).boxed()).sorted().mapToInt(x->x.intValue()).toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }

    // int [] array ={1,0,0,1,0,1,0,1} shift all the zeros at right using java 8 stream functionalities
    private static  void zeroShiftArray(int[] arr){
        int[] result = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(x->x.intValue()).toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 ={4,5,6};
        //joinTwoArrr(array1,array2);

        int [] array ={1,0,0,1,0,1,0,1};
        zeroShiftArray(array);

    }

}

/*

int[] array1 = {1,2,3}
int[] array2 ={4,5,6}

o/p : int [] result = {1,2,3,4,5,6}

// using java 8 and output


========================================
int [] array ={1,0,0,1,0,1,0,1} shift all the zeros at right using java 8 stream functionalities


================================================
// bole tooo  binary search code.
input -- int [] array = {2,2,3,3,4,5,8,9}

find the first occurance of the element indexwith the given key

Time complexity :O(log)n , key = 3
a
int start = 0;
int end = array.length;
int mid = (start+end)/2;
int key = 3;

for(int i = 0 ; i<=mid ; i++){
if(mid==key){
	sop(Found);
	break;
}else
	if(mid>key){
		start = mid;
	}
	else
		if(mid<key){
			end = mid;
		}
}


 */
