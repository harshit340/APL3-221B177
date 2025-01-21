class GetSet {
    private String name;
    private int age;
    
    public void setAge(int age){
       
       this.age = age;
    }
    public void setName(String name){
       
      this.name= name;
    }
    
    public void get(){
        System.out.println("My name is " + name + " and i am " + age + " year old");
    }
    
    
}


public class JUET
{
	public static void main(String[] args) {
		GetSet obj1 = new GetSet();
		
		obj1.setAge(25);
	
        obj1.setName("harshit");
	
		obj1.get();
	}
}
