package Day_2;

public class ExceptionDemo {
	private static String[] string=new String[]{"zhangsan","lisi","wanger"};
	public static boolean user(String str) {
		for(String ss:string) {
			if(ss.equals(str)) {
				throw new LogException("该用户"+str+"注册");
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo.user("lisi");
			System.out.println("注册成功");
		} catch (LogException e) {
			String str=e.getMessage();
			System.out.println(str);
			System.exit(0);//退出jvm虚拟机,后面的代码不会再执行
		}finally {
			System.out.println("nihao");
		}
	}
}
