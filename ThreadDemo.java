package Day_2;
/**
 * �߳�:
 * 1:�̳�Thread��
 * @author xie19
 *
 */
public class ThreadDemo extends Thread {
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("����Ϸ"+i);
		}
	}
}
