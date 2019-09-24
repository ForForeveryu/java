interface Animal {
        int ID=1;
        void breathe();
        void run();
}
class Dog implements Animal {
   public void breathe() {
            System.out.println("狗在呼吸");
        }
}
public class Example11{
       public static void main(String args []) {
             Dog dog=new Dog();
              dog.breathe();
              dog.run();
}
}