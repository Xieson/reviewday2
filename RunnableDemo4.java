package Day_2;
/**
 * 实现苹果的分配
 * @author xie19
 *
 */
public class RunnableDemo4 {
	public static void main(String[] args) {
		RunnableDemo3 rd=new RunnableDemo3();
		new Thread(rd,"向红").start();
		new Thread(rd,"小白").start();
		new Thread(rd,"小黑").start();
	}
}
