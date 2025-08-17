package com.datastructure.arraycode;

public class ArrayBasicMethods {

    //method to insert new element enter a array at the end
    private static String[] push( String[] array, String element){
        String[] newArray = new String[array.length +1];
        //copy existing element
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //add new element
        newArray[array.length] = element;
        // return new array
        return newArray;
    }

    //method to remove last element in an array
    private static String[] pop( String[] array){
        String[] newArray = new String[array.length-1];
        //copy existing element
        for (int i = 0; i < array.length-1; i++) {
            newArray[i] = array[i];
        }
        // return new array
        return newArray;
    }

    // insert at position x or slice method ( we can use systsem.arraycopy)
    private static String[] insertAt( String[] array, String element, int position){
        String[] newArray = new String[array.length +1];
        //copy existing element
        int i = 0; // position for exciting array
        int j = 0; // position for new array

        // copy existing element from old array to new array before position
        for ( ; i < position ; i++) {
            newArray[j] = array[i];
            j++;
        }
        // at position
        if(i==position) {
            newArray[j] = element;
        }
        // copy existing element from old array to new array after position
        for (int x = position+1 ; x < newArray.length; x++) {
            newArray[x] = array[i];
            i++;
            j++;
        }
        // return new array
        return newArray;
    }

    /*
    private static String[] insertAt(String[] array, String element, int position) {
    // Validate position
    if (position < 0 || position > array.length) {
        throw new IllegalArgumentException("Invalid position");
    }
    // Create a new array with an extra slot
    String[] newArray = new String[array.length + 1];
    // Copy elements before the position
    System.arraycopy(array, 0, newArray, 0, position);
    // Insert the new element at the specified position
    newArray[position] = element;
    // Copy the remaining elements after the position
    System.arraycopy(array, position, newArray, position + 1, array.length - position);
    return newArray;
    }
     */


    // Show all elements in array. -- used to print array elements
    private static void showAllElements(String[] arr){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }



    public static void main(String[] args) {

        // define array
        String names[] = new String[] {"abhishek","bhola","chandan","dharma","Golu"};
        showAllElements(names);

        // insert 1 element at the end
        names = push(names,"somesh");
        showAllElements(names);

        // remove last element from the end
        names = pop(names);
        showAllElements(names);

        // insert element at middle
        names = insertAt(names,"shalini",2);
        showAllElements(names);

    }

}
