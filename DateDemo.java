package Day_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Dateʱ����
 * @author xie19
 *
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat adf=new SimpleDateFormat();
		String pattern="yyyy-MM-dd : HH-mm-ss";
		adf.applyPattern(pattern);
		//��ʽ��
		String str=adf.format(date);
		System.out.println(str);
		//����
		Date time=adf.parse(str);
		System.out.println(time);
	}
}
