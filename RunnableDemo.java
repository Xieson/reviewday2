package Day_2;
/**
 * 线程
 * 2:实现Runnable接口
 * @author xie19
 *
 */
public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("打游戏"+i);
		}
		
	}
	
}
