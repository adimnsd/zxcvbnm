import java.util.Scanner;

public class Sj1 {
	public void sj1() {
		Scanner input = new Scanner(System.in);
		System.out.println("������γ̴���");
		try {
			int a = input.nextInt();
			if(a==1) {
				System.out.println("C#���");
			}else if(a==2) {
				System.out.println("java���");
			}else if(a==3){
				System.out.println("SQL����");
			}else {
				System.out.println("�����������3������������");
			}
		} catch (Exception e) {
			System.out.println("�����쳣");
		}
		System.out.println("��ӭ�������");
	}
}
