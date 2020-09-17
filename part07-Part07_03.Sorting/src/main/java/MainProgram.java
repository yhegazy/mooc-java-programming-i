import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

    System.out.println(Arrays.toString(numbers));

    MainProgram.swap(numbers, 1, 0);
    System.out.println(Arrays.toString(numbers));

    MainProgram.swap(numbers, 0, 3);
    System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array){

        int initialValue = array[0];

        for(int smallest : array){
            if(initialValue > smallest){
                initialValue = smallest;
            }
        }
        return initialValue;
    }

    public static int indexOfSmallest(int[] array){
        int index    = 0;
        int smallest = MainProgram.smallest(array);

        for (; index < array.length; index++){
            if(smallest == array[index]){
                break;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){

        //we're dictating the starting index
        int index        = startIndex;
        int initialValue = table[startIndex];
        
        for(int i = startIndex; i < table.length; i++){
            if(initialValue > table[i]){
                initialValue = table[i];
                index = i;
            }
        }
        return index;   
    }

    public static void swap(int[] array, int index1, int index2){

        //logic
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
       
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
