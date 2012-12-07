/**
 * 
 */
package testing.gopal.singletons.modifiedmultithreaded;

/**
 * @author gjhunjhunwala
 * 
 */
public class ModifiedSingletonProviderWithSync {

	SingletonThreadedModified instance;
	
	boolean isInitialized = false;
	int initializationCount = 0;

	public class SingletonThreadedModified {
		private SingletonThreadedModified() {
			isInitialized = true;
			initializationCount++;
		}
	}

	public SingletonThreadedModified getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadedModified.class) {
				if (instance == null) {
					instance = new SingletonThreadedModified();
				}
			}
		}
		return instance;
	}
	
	public void printStats() {
		System.out.println("Is Initialized Variable : " + isInitialized);
		System.out.println("Initialization Count Variable : " + initializationCount);
	}

}
