/**
 * 
 */
package testing.gopal.singletons;

import testing.gopal.singletons.SingletonProvider.Singleton;

/**
 * @author gjhunjhunwala
 *
 */
public class MainExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonProvider singletonProvider = new SingletonProvider();
		Singleton objectOne = singletonProvider.getInstance();
		singletonProvider.printStats();
		System.out.println(objectOne);
		
		Singleton objectTwo = singletonProvider.getInstance();
		singletonProvider.printStats();
		System.out.println(objectTwo);
		
		Singleton objectThree = singletonProvider.getInstance();
		singletonProvider.printStats();
		System.out.println(objectThree);
		
		Singleton objectFour = singletonProvider.getInstance();
		singletonProvider.printStats();
		System.out.println(objectFour);
	}

}
