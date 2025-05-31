package ClassWork.OOPClass.SecondClass;

public class Laptop {
    private String color;
    private String model;
    private double price;

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public void openApp(){
        System.out.println(model+" opened app.");
    }
    public void closeApp(){
        System.out.println(model+" closed app");
    }
}

class LaptopDriver{
    public static void main(String[] args) {
        Laptop acer = new Laptop();
        // acer.model = "Acer";
        // System.out.println(acer.model);
        acer.setModel("Acer");
        String val = acer.getModel();
        System.out.println(val);
        acer.openApp();
    }
}

// Objects have 
// identity - name : acer
// properties - attributes/variables : model,color,price
// behaviours - methods : openApp,closeApp,getter and setters
