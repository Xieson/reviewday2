package Day_2;

import java.util.Random;
import java.util.UUID;

public class StringDemo {
	public static void main(String[] args) {
//		String name="a,b,c,hs.ads,hr.t,e,htt.r,d,e,f,g,holle";
//		String[] srt=name.split(",");//split("?")?代表这个字符转遇到这个?的值时把字符转切割开
//		for(String s:srt) {
//			if(s.startsWith("h")) {
////			System.out.println(s);
//			int index=s.lastIndexOf(".");
////			System.out.println(index+"   ");
//			if(index>=0) {
//			String syString=s.substring(index);//截取从index后面的值
//			System.out.println(syString);
//			}
//			}
//		}
//		String string=" A b c d ";
//		String str=string.substring(0, 1);
//		System.out.println(str.toUpperCase());//toUpperCase()将字母转化为大写
//		System.out.println(string);
//		String st=str.toUpperCase();
//		String s=string.substring(1);
//		System.out.println(st+s);
//			System.out.println(string.length());
//			System.out.println(string.trim().length());//去除两边的空格
//	
//		String uuid=UUID.randomUUID().toString();
//		System.out.println(uuid);
//		String[] srt=uuid.split("-");
//		StringBuilder sb=new StringBuilder(23);
//		System.out.println(sb.capacity());
//		for(String uu:srt) {
////			System.out.println(uu);
//			sb.append(uu);
//		}
//		System.out.println(sb);
//		String uu=uuid.substring(0,5);
//		System.out.println(uu);
//		String str="12312ABCabc";
//		String str1=str.toLowerCase();//将字符串中的大写字母转换为小写
//		String str2=str.toUpperCase();//将字符转里面的小写字母转化为大写
//		System.out.println(str2);
//		System.out.println(str1);
		String str="ABCDEFGHIJKLMNOPQRSTUVWSYZ";
		str+=str.toLowerCase();
		str+="1234567890";
		StringBuilder ab=new StringBuilder(5);
		for(int i=0;i<5;i++) {
			char ch=str.charAt(new Random().nextInt(str.length()));
			ab.append(ch);
		}
		System.out.println(ab);
	}
}
