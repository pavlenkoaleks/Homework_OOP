import java.util.ArrayList;
import java.util.List;

import data.HotCoffee;
import data.HotDrinkAutomat;
import view.view;

public class main {
    public static void main(String[] args) {

       
       HotCoffee hotCoffee1 = new HotCoffee("капучино",80, 100,400);
       HotCoffee hotCoffee6 = new HotCoffee("капучино",80, 90,200);
       HotCoffee hotCoffee7 = new HotCoffee("капучино",80, 80,300);
       HotCoffee hotCoffee8 = new HotCoffee("капучино",80, 70,200);
       HotCoffee hotCoffee2 = new HotCoffee("латте",70, 120,400);
       HotCoffee hotCoffee3 = new HotCoffee("американо",70, 80,300);
       HotCoffee hotCoffee4 = new HotCoffee("мокачино",60, 150,350);
       HotCoffee hotCoffee5 = new HotCoffee("эспрессо",95, 50,50);


       List <HotCoffee> prodList = new ArrayList<>(List.of(hotCoffee1,hotCoffee2,hotCoffee3,hotCoffee4,hotCoffee5,hotCoffee6,hotCoffee7,hotCoffee8));
      
        //HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
       // hotDrinkAutomat .initProducts(prodList);
     //  hotDrinkAutomat .getProduct("капучино",400,80);
       //hotDrinkAutomat .getProduct("сок",400,80);

       view.init(new ArrayList<>(List.of(hotCoffee1,hotCoffee2,hotCoffee3,hotCoffee4,hotCoffee5,hotCoffee6,hotCoffee7,hotCoffee8)));
       view.getProduct("капучино",0,80);
       view.getProduct("сок",400,80);

    


    }
}
