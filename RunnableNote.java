public class RunnableNote{
    public static void main (String[] args){
	NoteWindow nw=new NoteWindow();
	new Thread(nw,"��ʦ 1").start();
	new Thread(nw,"��ʦ 2").start();
	new Thread(nw,"��ʦ 3").start();
	}
}
class NoteWindow implements Runnable{                                   
     private int notes=80;
	 public void run(){
	 while(true){
	 if(notes>0){
	 Thread th=Thread.currentThread();
	 String th_name=th.getName();
	 System.out.println(th_name+" ���ڷ��۵� "+notes--+"��Ʊ");
	 }
	 }
	 }
}