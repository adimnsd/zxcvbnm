
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age>100||age<1) {
			throw new Exception("���������1��100֮��");
		}else {
			this.age = age;
		}
	}
	
}
