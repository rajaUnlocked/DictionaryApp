public class StackX {
    char[] arr;
    int size , top;

    public StackX(int s) {
        size = s;
        arr = new char[size];
        top=0;
    }
    public void push(char value){
        arr[++top]=value;
    }
    public char pop(){
        return  arr[top--];
    }
    public char peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top==0;
    }
}
 class  StackApp {
     public static void main(String[] args) {
         StackX theStack = new StackX(10);
         theStack.push('R');
         theStack.push('A');
         theStack.push('H');
         theStack.push('C');
         theStack.push('1');

         while(!theStack.isEmpty()) {
             char value= theStack.pop();
             System.out.println(value);

         }
         QueueS qq=new QueueS(10);

         qq.insert(13);
         qq.insert(14);
         qq.insert(15);
         qq.insert(16);
         qq.insert(17);
         while(!qq.isEmpty()){
             int value=qq.remove();
             System.out.println("Arr "+value);
         }

     }
 }
 class QueueS{
    int[] arr;
    int size, front, rear;
    public QueueS(int size){
        this.size=size;
        arr=new int[size];
        front =0;
        rear=-1;
    }
    public void insert(int value){
        if(rear==size-1){
            rear=-1;
        }
        arr[++rear]=value;
    }
    public int remove(){
        int temp=arr[front++];
        if(front == size-1){
            front=0;
        }
        return temp;
    }
    public boolean isEmpty(){
        return (front== rear+1 ||front+size-1==rear);
    }

 }