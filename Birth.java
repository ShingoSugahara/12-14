import java.util.Scanner;

public class Birth {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int month=0;
		int day=0;
		int age=0;
		int trueAge=0;
		age=Year();
		Month();
		Day();
		trueAge=ageResult(month,day,age);
		showResult(trueAge);
	}




		public static int Year() {
			int year=0;

			Scanner scan = new Scanner(System.in);
			System.out.print("西暦を入力してください：");
			year = scan.nextInt();
			int age = 2020-year;
			return age;




		}
		public static int Month() {
			Scanner scan = new Scanner(System.in);
			int month=0;

			System.out.print("月を入力してください：");
			month = scan.nextInt();
			return month;
		}
		public static int Day() {
			int day = 0;
			Scanner scan = new Scanner(System.in);
			System.out.print("日を入力してください：");
			day = scan.nextInt();
			return day;
		}
		public static int ageResult(int month,int day,int age) {

			if(12<=month&&14>=day) {
			return age;
		}else {
			return age-1;

		}
}
		public static void showResult(int trueAge) {
			System.out.println("あなたの年齢は"+trueAge);
		}
}