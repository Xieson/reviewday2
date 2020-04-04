package Day_2;
/**
 * ¿ªÆôÏß³Ì
 * @author xie19
 *
 */
public class THreadDemo1 {
	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			System.out.println("Ìý¸è"+i);
			if(i==10) {
				Thread thread=new ThreadDemo();
				thread.start();
			}
		}
	}
}
