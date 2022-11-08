public class CarModel {
    // fields.
    private String model;
    private String make;
    private String years;
    // construction
    public CarModel(String model, String make, String years){
        this.model = model;
        this.make = make;
        this.years = years;
    }

    public void setModel(String model){

        this.model = model;
    }

    public String getModel() {

        return model;
    }

    public void setMake(String make){

        this.make = make;
    }
    public String getMake(){

        return make;
    }
    public void setYears(String years){

        this.years = years;
    }

    public String getYears() {
        return years;
    }
}

