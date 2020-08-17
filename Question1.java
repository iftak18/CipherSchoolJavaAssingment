package Cipher;
interface Cal{  
    int add(int a,int b);  
}  
  
public class Question1 {  
    public static void main(String[] args) {  
          
        Cal ad=(a,b)->(a+b);  
        System.out.println(ad.add(10,20)); 
        Cal sub=(a,b)->(a-b);  
        System.out.println(sub.add(10,20)); 
        Cal mul=(a,b)->(a*b);  
        System.out.println(mul.add(10,20)); 
        Cal div=(a,b)->(a/b);  
        System.out.println(div.add(10,20)); 
        
    }  
}