public class RunnableCar{
    public static void main (String[] args){
	CarWindow cw=new CarWindow();
	new Thread(cw,"˾�� 1").start();
	new Thread(cw,"˾�� 2").start();
	new Thread(cw,"˾�� 3").start();
	}
}
class CarWindow implements Runnable{                                   
     private int chengke=100;
	 public void run(){
	 while(true){
	 if(chengke>0){
	 Thread th=Thread.currentThread();
	 String th_name=th.getName();
	 System.out.println(th_name+" ���ڽ��͵� "+chengke--+"�˿�");
	 }
	 }
	 }
}