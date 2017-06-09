package searching.sorting;

public class BubbleSort {

    public static void BubbleSort(int[] num) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
             //set flag to false awaiting a possible swap
             //swap elements
            //shows a swap occurred  
                
        }
       //Show the output
    }

    public static void SelectionSort(int[] num) {
        int i, j, first, temp;
        for (i = num.length - 1; i > 0; i--) {
            first = 0;   //initialize to subscript of first element
            for (j = 1; j <= i; j++) //locate smallest element between positions 1 and i.
            {
             
            }
           //swap smallest found with element in position i.
         
        }
       //Show the output
    }

    public static void InsertionSort(int[] num) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;

        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            // Smaller values are moving up
            // Put the key in its proper location
        }
        //Show the output
    }
}
