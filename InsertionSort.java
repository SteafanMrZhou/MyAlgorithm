package algorithmPractice;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
public class InsertionSort {
    int[] iNum = new int[]{11,22,33,5,6,9,0,21,35,23,20,10,7,55,100,94,92,90,30,61};
    int IStemp;


    public void doInsertionSort(){
        for(int i = 1; i < iNum.length; i++){
            for(int j = i; j > 0; j--){
                if(iNum[j] < iNum[j -1]){
                    IStemp = iNum[j];
                    iNum[j] = iNum[j - 1];
                    iNum[j - 1] = IStemp;
                }else {
                    break;
                }
            }
        }
        //            输出排序结果
        for(int k = 0; k < iNum.length; k++){
            System.out.print(" " + iNum[k]);
        }
    }

    public static void main(String[] args){
        InsertionSort is = new InsertionSort();
        is.doInsertionSort();
    }
}
