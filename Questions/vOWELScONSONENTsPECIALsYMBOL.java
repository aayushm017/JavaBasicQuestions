package Questions;

public class vOWELScONSONENTsPECIALsYMBOL {
    public static void main(String[] args) {
        String x = "aayush is a good boy";
        x = x.toUpperCase();
        char[] y =x.toCharArray();
        int size = y.length;

        int vowel = 0;
        int consonent = 0;
        int splSymbol = 0;

        int  i = 0;
        while(i!=size){
            if(y[i]>='A' && y[i]<='Z'){
                if(y[i]=='A' || y[i]=='E' || y[i]=='I' || y[i]=='O' || y[i]=='U'){
                    vowel++;
                }else{
                    consonent++;
                }
            }else{
                splSymbol++;
            }
            i++;
        }
        System.out.println("Vowel = " + vowel);
        System.out.println("Consonent = " + consonent);
        System.out.println("Special Symbol = " + splSymbol);
    }
}
