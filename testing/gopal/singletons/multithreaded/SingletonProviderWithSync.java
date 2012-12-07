/**
 * 
 */
package testing.gopal.singletons.multithreaded;

/**
 * @author gjhunjhunwala
 * 
 */
public class SingletonProviderWithSync {

	SingletonThreaded instance;

	boolean isInitialized = false;
	int initializationCount = 0;

	public class SingletonThreaded {
		private SingletonThreaded() {
			isInitialized = true;
			initializationCount++;
		}
	}

	public synchronized SingletonThreaded getInstance() {
		if (instance == null) {
			instance = new SingletonThreaded();
			System.out.println("New Object is created.");
		}
		return instance;
	}

	public void printStats() {
		System.out.println("Is Initialized Variable : " + isInitialized);
		System.out.println("Initialization Count Variable : " + initializationCount);
	}

}
