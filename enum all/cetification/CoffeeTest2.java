class Coffee2 {
enum CoffeeSize {BIG, HUGE, OVERWHELMING }
CoffeeSize size;
}
public class CoffeeTest2 {
public static void main(String[] args) {
Coffee2 drink = new Coffee2();
drink.size = Coffee2.CoffeeSize.BIG; // enclosing class
// name required
System.out.println(drink.size);
//try
//drink.size=Coffee2.CoffeeSize.valueOf("MEDIUM");
//System.out.println(drink.size);
}
}

