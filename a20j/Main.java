import java.util.*;  

public class Main  
{  
public static void main(String[] args)  
    {  
        Scanner scn = new Scanner(System.in); //System.in is a standard input stream  
        String str = scn.nextLine();              //reads string   
        
        String[] arr = str.split("WUB");
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print(arr[len-1]);

    }  
}  