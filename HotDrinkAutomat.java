import java.util.ArrayList;
import java.util.List;



public class HotDrinkAutomat implements Automat {
    public List<HotCoffee> list = new ArrayList<>();
    
   @Override
    public void initProducts(List <HotCoffee> newList) {
         this.list = newList;
         System.out.println(newList);
    }

    @Override
    public void getProduct(String name,int volume, int temp) {
        int count =0;

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getName().equals(name))&&
            (list.get(i).getVolume() == volume)&&
            (list.get(i).getTemp()==temp)) 
            
            {
                System.out.println(list.get(i));
                count++;
            }

            
        }
        if (count==0){
            System.out.println("такого напитка нет!");
        }
    }
}