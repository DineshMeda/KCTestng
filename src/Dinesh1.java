
public class Dinesh1 {

    Dinesh1(int a,String b)
    {
    	this(10,20.0);
    	
    System.out.println(a+b);
    
    }
    
     Dinesh1(int z,double i){
    	 
    	 this(20,30);
    	 
    	 System.out.println(z+i);
     }
     
     Dinesh1(int x,int b)
     {
    	this("string1","string2");
    	
    	 System.out.println(x+b);
     }
     
         Dinesh1(String a,String b)
     {
        	 this(24,23,67);
        	 
    	 System.out.println(a+b);
     }
         
     Dinesh1(int w,int p,int r)
     {
    	 this();
    	 
    	 System.out.println(w+p+r);
     }
     
     Dinesh1(){
    	 
    	 System.out.println("Default Constructor");
     }
   
       	public static void main(String[] args) 
	
	{
    	Dinesh1 obj1= new Dinesh1(20,"bv");
    
   	}
     
}

