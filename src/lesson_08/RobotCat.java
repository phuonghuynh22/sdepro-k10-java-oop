package lesson_08;

//Class is a template/blueprint to design an object
public class RobotCat {
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

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }
}
