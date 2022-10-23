package BasicImpQuestions;

class mergeArray{
     public static void main(String[] args){
            int a[]={4,5,9};
            int b[]={12,14,16,17,18};
            int a_length=a.length;
            int b_length=b.length;
            int c_length=a_length+b_length;
            int[] c=new int[c_length];

          for(int i=0; i<a_length; i++){
               c[i]=a[i];
         }
         for(int i=0; i<b_length; i++){
               c[a.length+i]=b[i];
         }
        for(int i=0; i<c_length; i++){
        System.out.print(c[i]+ " ");
      }  
   } 
}