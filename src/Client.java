public class Client {

	public static void main(String[] args){

		Singleton test1 =  Singleton.getInstance();

		Singleton test2 =  Singleton.getInstance();

		if(test1 == test2)
			System.out.println("test1 and test2 are same instance of Singleton class");
		
	}
}
