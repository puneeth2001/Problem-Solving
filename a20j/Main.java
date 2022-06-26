import java.util.*;  

public class Main  
{  
public static void main(String[] args)  
    {  
        Scanner scn = new Scanner(System.in); //System.in is a standard input stream  
        int n = scn.nextInt();              //reads string   
        int[] intArray = new int[3*n];
        int p =0;int q=0;int r=0;
        for(int i = 0;i<n*3;i++){
            int val = scn.nextInt();
            intArray[i] = val;
        }
    
        for(int i = 0;i<n*3;i+=3){
            p = p+intArray[i];
            q = q+intArray[i+1];
            r = r+intArray[i+2];
        }

        if(p==0 && q==0 && r==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }  
}  