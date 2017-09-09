package algorithmPractice;

/**
 * Created by Steafan on 2017/9/9 0009.
 */
public class SelectionSort {
    int index;
    int temp;

    public void doSelectionSort(){
        int[] num = new int[]{15,20,55,2,66,7,9,26,28,13};
        for(int i = 0; i < num.length - 1; i ++){
//            遍历索引找到最小值
            index = i;
            for(int j = i + 1; j < num.length; j++){
                if(num[j] < num[index]){
//                    存放最小值的索引
                    index = j;
                }
//                已经找到了最小值
            }
//            交换位置
            if(index != i){
                temp = num[i];
                num[i] = num[index];
                num[index] = temp;
            }
        }
//        输出排序结果
        for(int k = 0; k < num.length; k ++){
            System.out.print(" " + num[k]);
        }
    }

    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        ss.doSelectionSort();
    }



}
