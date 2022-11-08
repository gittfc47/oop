import java.io.*;
import java.util.*;

public class CarManager {
    ArrayList<CarModel> cars = new ArrayList<>();

    public void loadCars()
            throws IOException{

        String fileName = "C:/Users/TFCHEN/Desktop/Java 2438 Asignment/carModel/src/carModel.txt";


        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        // read first line
        String line = br.readLine();
        // read each line from carModel
        while(line !=null){
            String[] tokens = line.split(",");
            String model = tokens[0];
            String make = tokens[1];
            String years = tokens[2];
            CarModel car = new CarModel(model,make,years);
            cars.add(car);
            line = br.readLine();
        }

    }

    public void search(String searchStr) {
        for (int index = 0; index < cars.size(); index++) {
            CarModel car = cars.get(index);
            if (car.getModel().equals(searchStr))
                System.out.println(searchStr + " is found at " + index);
        }
    }

    public static void main(String[] args) throws IOException{
        CarManager carManager = new CarManager();
        carManager.loadCars();
        // create a scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What model do you want to search? ");
        String searchStr = keyboard.nextLine();
        carManager.search(searchStr);

    }
}



