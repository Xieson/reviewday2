package Day_2;

public class Internal {
	private  static String name="shangsan";
	public static void test() {
		System.out.println(new App().name);
	}
	static class App{
		private  final String name="lisi";
		public  void app1() {
			System.out.println(Internal.name);
		}
	}
	
	public static void main(String[] args) {
		Internal.test();
		Internal.App app=new Internal.App();
		app.app1();
	}
}
