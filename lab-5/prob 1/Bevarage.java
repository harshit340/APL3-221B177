abstract class Bevarage{
    
    private void pourBevarage(int qty){
        System.out.println("Pour " + qty + "ml of bevarage in glass");
    }
    protected abstract void addCondiment();
    protected void stir(){
        
    }
    private  void serve(){
        System.out.println("serve by waiter");
    }
    
    public void templeteBevarage(int qty){
        pourBevarage(qty);
        addCondiment();
        stir();
        serve();
    }
}