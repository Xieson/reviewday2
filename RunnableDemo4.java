package Day_2;
/**
 * ʵ��ƻ���ķ���
 * @author xie19
 *
 */
public class RunnableDemo4 {
	public static void main(String[] args) {
		RunnableDemo3 rd=new RunnableDemo3();
		new Thread(rd,"���").start();
		new Thread(rd,"С��").start();
		new Thread(rd,"С��").start();
	}
}
