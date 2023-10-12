package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout.Group;

import data.HotCoffee;
import data.HotDrinkAutomat;

public class Controller {
     
  public HotDrinkAutomat initProd(List<HotCoffee>prodList){
    
      HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
     hotDrinkAutomat.initProducts(prodList);
        return hotDrinkAutomat;
      }

  public HotDrinkAutomat getProd(String name,int volume, int temp){
    HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
     hotDrinkAutomat.getProduct(name,volume,temp);
        return hotDrinkAutomat;

  }



}
