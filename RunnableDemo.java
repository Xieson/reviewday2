package Day_2;
/**
 * �߳�
 * 2:ʵ��Runnable�ӿ�
 * @author xie19
 *
 */
public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("����Ϸ"+i);
		}
		
	}
	
}
