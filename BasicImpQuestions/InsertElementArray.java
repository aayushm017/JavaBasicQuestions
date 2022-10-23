class InsertElementArray{
public static void main(String[] args){
int n[]={1,4,6,88,90};
int pos=3;
int elem=100;

       for(int i=n.length-1; i>pos-1; i--){
             n[i]=n[i-1];
      }
     n[pos-1]=elem;
     for(int i=0; i<n.length;i++){
             System.out.print(n[i]+" ");
     }
   }
}