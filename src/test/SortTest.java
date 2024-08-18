package test;

public class SortTest {

    //冒泡排序
    public static void bubbleSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (array[j] < array[i]){
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[index] > array[j]){
                    index = j;
                }
            }
            if (i != index){
                int t = array[index];
                array[index] = array[i];
                array[i] = t;
            }
        }
    }

    //插入排序
    public static void insertSort(int[] array){
        if (array == null || array.length < 2){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp = array[i];
            for (; j > 0; j--){
                if (array[j-1] > temp){
                    array[j] = array[j-1];
                }else {
                    break;
                }
            }
            array[j] = temp;
        }
    }

    //快速排序
    public static void quickSort(int[] array, int start, int end){
        if (start < end){
            int key = array[start];
            int i = start;
            for (int j = start + 1; j <= end; j++){

            }
        }
    }
}
