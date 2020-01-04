import java.util.Scanner;

public class Sj1 {
	public void sj1() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程代号");
		try {
			int a = input.nextInt();
			if(a==1) {
				System.out.println("C#编程");
			}else if(a==2) {
				System.out.println("java编程");
			}else if(a==3){
				System.out.println("SQL基础");
			}else {
				System.out.println("输入的数大于3，请重新输入");
			}
		} catch (Exception e) {
			System.out.println("输入异常");
		}
		System.out.println("欢迎提出建议");
	}
}
