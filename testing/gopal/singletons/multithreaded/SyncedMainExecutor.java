/**
 * 
 */
package testing.gopal.singletons.multithreaded;


/**
 * @author gjhunjhunwala
 *
 */
public class SyncedMainExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SingletonProviderWithSync singletonProviderWithSync = new SingletonProviderWithSync();

		ExampleThread exampleThreadOne = new ExampleThread(singletonProviderWithSync);
		ExampleThread exampleThreadTwo = new ExampleThread(singletonProviderWithSync);
		ExampleThread exampleThreadThree = new ExampleThread(singletonProviderWithSync);
		ExampleThread exampleThreadFour = new ExampleThread(singletonProviderWithSync);
		
		exampleThreadOne.start();
		exampleThreadTwo.start();
		exampleThreadThree.start();
		exampleThreadFour.start();
		
	}

}
