package application;

public class Person {
    private String name;
    private double height;
    

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Person(){
        this.name ="?";
        this.height = 0.0;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "Name: "+name+ ", height: "+height;
    }


}