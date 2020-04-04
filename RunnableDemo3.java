package Day_2;
/**
 * 线程共享一个资源
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
				System.out.println(Thread.currentThread().getName()+num+"号苹果");
				num--;
					}
			}
		}
	}

}
