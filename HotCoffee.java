
public class HotCoffee extends HotDrink{

    int temp;
    public int getTemp() {
        return temp;
    }
    

    public HotCoffee(String name,int temp, int cost,int volume) {
        this.name = name; 
        this.cost = cost;
        this.temp = temp;
        this.volume = volume;
    }
    

    

    @Override
    public String toString() {
        return "Drink {" + name +
                " cost = " + cost +
                " volume = " + volume+
                " temp = " + temp+
                '}';
    }
}
