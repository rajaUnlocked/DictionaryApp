import java.util.Random;
public class SortingArray {
    public static  void main(String[] args){
        int[] arr=new int[10];
        Shorting bs=new Shorting(10);

        for (int i=0; i< bs.size;i++ ) {
            int ran = (int) (java.lang.Math.random() * (bs.size - 1));
            bs.insert(ran);

        }
        bs.displsy();
        System.out.println(" ");

        bs.bubbleShort();
        bs.displsy();
        //*-------------------*/
        bs.selectionShort();
        bs.displsy();

        //*-------------------*/
        bs.insertionShort();
        bs.displsy();
    }
}

class Shorting{
    int [] arr;
    int size;
    int nElement;
    public Shorting(int s) {
        size=s;
        arr=new int[size];
        nElement=0;
    }
    public void insert(int value){
        arr[nElement]=value;
        nElement++;
    }
    public void displsy(){
        for(int i=0; i<nElement;i++ ){
            System.out.print("Array:= "+arr[i] +", ");}
        System.out.println(" ");
    }
    public void swap(int one, int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }

    public void bubbleShort(){
        int in, out;
        for(out=nElement-1; out>1;out--)
            for(in = 0; in<out; in++) //2
                if(arr[in]>arr[in+1])
                    swap(in, in+1);
    }

    public void selectionShort(){
        int in, min, out;
        for(out=0; out<nElement-1; out++){
            min=out;
            for(in=1; in<nElement;in++)
                if(arr[in]<arr[min])
                    min=in;
                swap(out, min);
        }
    }
    public void insertionShort(){

        for (int i = 0; i < nElement; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && arr[j - 1] >= temp) {
                arr[j]= arr[j-1];
                --j;
            }
            arr[j] = temp;
        }
    }
}