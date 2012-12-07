/**
 * 
 */
package testing.gopal.singletons;

/**
 * @author gjhunjhunwala
 * 
 */
public class SingletonProvider {

	Singleton singletonInstance;

	boolean isInitialized = false;
	int initializationCount = 0;

	public class Singleton {
		private Singleton() {
			isInitialized = true;
			initializationCount++;
		}
	}

	public Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
	
	public void printStats() {
		System.out.println("Is Initialized Variable : " + isInitialized);
		System.out.println("Initialization Count Variable : " + initializationCount);
	}

}
