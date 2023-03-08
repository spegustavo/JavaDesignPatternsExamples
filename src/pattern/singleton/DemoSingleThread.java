package pattern.singleton;

public class DemoSingleThread {

	/*
	 * Singleton is a creational design pattern, which ensures that only one object
	 * of its kind exists and provides a single point of access to it for any other
	 * code.
	 * 
	 * Singleton has almost the same pros and cons as global variables. Although
	 * they’re super-handy, they break the modularity of your code.
	 * 
	 * You can’t just use a class that depends on a Singleton in some other context,
	 * without carrying over the Singleton to the other context. Most of the time,
	 * this limitation comes up during the creation of unit tests.
	 * 
	 */
	
	
	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		
		Singleton singleton = Singleton.getInstance("FOO");
		
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);

	}

}
