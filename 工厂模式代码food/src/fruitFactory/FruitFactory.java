package simpleFactory;

public class FruitFactory {    
    
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        Class fruit = Class.forName(FruitFactory.class.getPackage().getName()+"."+type);
        return (Fruit) fruit.newInstance();
    }
}