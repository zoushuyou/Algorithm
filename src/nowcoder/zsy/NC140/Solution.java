package nowcoder.zsy.NC140;

public class Solution {

    //冒泡排序
    public int[] MySort (int[] arr) {
        if (arr.length == 1 || arr.length == 0){
            return arr;
        }
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length -i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
