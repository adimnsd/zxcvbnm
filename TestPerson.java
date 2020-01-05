
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person();
		try {
			a.setAge(60);
			System.out.print("ÄêÁäÎª"+a.getAge());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
