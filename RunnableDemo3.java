package Day_2;
/**
 * �̹߳���һ����Դ
 * @author xie19
 *
 */
public class RunnableDemo3 implements Runnable{
	private static int num=50;
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			synchronized (this) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+num+"��ƻ��");
				num--;
					}
			}
		}
	}

}
