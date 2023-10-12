package view;

import javax.swing.GroupLayout.Group;
import controller.Controller;
import data.HotCoffee;
import data.HotDrinkAutomat;

import java.util.ArrayList;
import java.util.List;
 
public class view {
    
    
    public static HotDrinkAutomat init(List<HotCoffee>coffee){
    Controller controller = new Controller();
     return  controller.initProd(coffee);

    }

    public static HotDrinkAutomat getProduct(String name,int volume, int temp){
    Controller controller = new Controller();
     return  controller.getProd(name,volume,temp);

    }


}
