public class ThreadExample01 {
	public static void main(String[] arge) {
		MyThread myThread=new MyThread();
		myThread.run();
		while (true){
			System.out.println("Main方法在运行");
		}
	}
}
class MyThread{
	public void run() {
		while (true){
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}

