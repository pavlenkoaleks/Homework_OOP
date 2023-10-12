package data;
import java.util.ArrayList;
import java.util.List;

public interface Automat {
    


    public List<HotCoffee> list = new ArrayList<>();

     void initProducts (List <HotCoffee> newList) ;

     void getProduct(String name,int volume, int temp) ;

}
