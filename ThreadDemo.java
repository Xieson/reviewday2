package Day_2;
/**
 * 线程:
 * 1:继承Thread类
 * @author xie19
 *
 */
public class ThreadDemo extends Thread {
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("打游戏"+i);
		}
	}
}
