package SortAlgoritms;

public class InsertionSort {
    public static void main(String[] args) {

        int[]intArray = {20,35,-15,7,55,1,-22} ;

        for(int firsUnsortedIndex = 1 ; firsUnsortedIndex < intArray.length ; firsUnsortedIndex++){

            int newElement = intArray[firsUnsortedIndex] ;
            int i ;
           for(i = firsUnsortedIndex ; i > 0 && intArray[i-1] > newElement ; i--){
               intArray[i] = intArray[i-1] ;
           }

           intArray[i] = newElement ;
        }


        for(int i = 0 ; i < intArray.length ; i++){
            System.out.println(intArray[i]);
        }



    }
}
