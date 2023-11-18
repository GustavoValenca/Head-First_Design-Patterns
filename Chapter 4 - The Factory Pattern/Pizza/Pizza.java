package Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("Preparing " + getName());
    }
    
    public void bake(){}
    public void cut(){}
    public void box(){}

    public String getName(){
        return this.name;
    }
}

