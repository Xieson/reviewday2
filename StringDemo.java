package Day_2;

import java.util.Random;
import java.util.UUID;

public class StringDemo {
	public static void main(String[] args) {
//		String name="a,b,c,hs.ads,hr.t,e,htt.r,d,e,f,g,holle";
//		String[] srt=name.split(",");//split("?")?��������ַ�ת�������?��ֵʱ���ַ�ת�и
//		for(String s:srt) {
//			if(s.startsWith("h")) {
////			System.out.println(s);
//			int index=s.lastIndexOf(".");
////			System.out.println(index+"   ");
//			if(index>=0) {
//			String syString=s.substring(index);//��ȡ��index�����ֵ
//			System.out.println(syString);
//			}
//			}
//		}
//		String string=" A b c d ";
//		String str=string.substring(0, 1);
//		System.out.println(str.toUpperCase());//toUpperCase()����ĸת��Ϊ��д
//		System.out.println(string);
//		String st=str.toUpperCase();
//		String s=string.substring(1);
//		System.out.println(st+s);
//			System.out.println(string.length());
//			System.out.println(string.trim().length());//ȥ�����ߵĿո�
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
//		String str1=str.toLowerCase();//���ַ����еĴ�д��ĸת��ΪСд
//		String str2=str.toUpperCase();//���ַ�ת�����Сд��ĸת��Ϊ��д
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
