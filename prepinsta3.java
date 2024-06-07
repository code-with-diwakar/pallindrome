
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
     Scanner s=new Scanner(System.in);
     String name=s.nextLine();
     StringBuilder sb=new StringBuilder(name);
     sb.reverse();
     
     if(name.compareTo(sb.toString())==0){
         System.out.println("Pallindrome");
     }
    
    else{
        System.out.println("not pallindrome");
    }
    }
}
