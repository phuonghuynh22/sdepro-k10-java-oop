package lesson_09;

// Super class | Parent class

//Class is a template/blueprint to design an object
public class RobotCat extends Grandpa{
    private String name;
    private String productionDate;

    //a blank constructor should be created by default so that this can be used if needed

    //constructor overloading
    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }
    public String charge(){
        return "charging...";
    }

}
