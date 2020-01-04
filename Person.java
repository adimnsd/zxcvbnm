
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age>100||age<1) {
			throw new Exception("年龄必须在1到100之间");
		}else {
			this.age = age;
		}
	}
	
}
