package Day_2;

public class TestDay2 {
	public static final Day2_1[] day1=new Day2_1[3];
	public static int number=0;
	public static void usb(Day2_1 day) {
		if(number<=day1.length-1) {		
			day1[number]=day;
			number++;
		}else {
			System.out.println("¿¨²ÛÒÔ²åÂú");
		}
	}
	public static void main(String[] args) {
		Day2_1 day2=new Day2_2();
		Day2_1 day3=new Day2_3();
//		day2.IUSB();
		TestDay2.usb(day2);
		TestDay2.usb(day3);
		TestDay2.usb(day2);
		TestDay2.usb(day3);
		System.out.println(number);
		for(Day2_1 us:day1) {
			us.IUSB();
		}
	}
}
