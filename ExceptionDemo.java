package Day_2;

public class ExceptionDemo {
	private static String[] string=new String[]{"zhangsan","lisi","wanger"};
	public static boolean user(String str) {
		for(String ss:string) {
			if(ss.equals(str)) {
				throw new LogException("���û�"+str+"ע��");
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo.user("lisi");
			System.out.println("ע��ɹ�");
		} catch (LogException e) {
			String str=e.getMessage();
			System.out.println(str);
			System.exit(0);//�˳�jvm�����,����Ĵ��벻����ִ��
		}finally {
			System.out.println("nihao");
		}
	}
}
