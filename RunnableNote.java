public class RunnableNote{
    public static void main (String[] args){
	NoteWindow nw=new NoteWindow();
	new Thread(nw,"老师 1").start();
	new Thread(nw,"老师 2").start();
	new Thread(nw,"老师 3").start();
	}
}
class NoteWindow implements Runnable{                                   
     private int notes=80;
	 public void run(){
	 while(true){
	 if(notes>0){
	 Thread th=Thread.currentThread();
	 String th_name=th.getName();
	 System.out.println(th_name+" 正在发售第 "+notes--+"张票");
	 }
	 }
	 }
}