
class Dinesh
{
    Dinesh()
    {
    System.out.println("onlineclass");
    }
     Dinesh(int a){
    	 System.out.println(a);
     }
     Dinesh(int a,int b)
     {
    	 System.out.println(a+b);
     }
         Dinesh(String a,String b)
     {
    	 System.out.println(a+b);
     }
     Dinesh(int a,String b)
     {
    	 System.out.println("a+b");
     }
   
       	public static void main(String[] args) 
	
	{
    	Dinesh obj1= new Dinesh();
    	Dinesh obj2= new Dinesh(100);
    	Dinesh obj3= new Dinesh(10,20);
    	Dinesh obj4= new Dinesh(10,"testing");
    	Dinesh obj5= new Dinesh("selenium","QTP");
   	}
     
}
