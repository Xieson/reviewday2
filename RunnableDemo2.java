package Day_2;
/**
 * �߳�����
 * @author xie19
 *
 */
public class RunnableDemo2 {
	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			System.out.println("����"+i);
			if(i==10) {
				RunnableDemo rd=new RunnableDemo();
				Thread th=new Thread(rd);
				th.start();
			}
		}
	}
	
}
