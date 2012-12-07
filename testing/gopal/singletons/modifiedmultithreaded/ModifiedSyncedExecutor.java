/**
 * 
 */
package testing.gopal.singletons.modifiedmultithreaded;


/**
 * @author gjhunjhunwala
 *
 */
public class ModifiedSyncedExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ModifiedSingletonProviderWithSync modifiedSingletonProviderWithSync = new ModifiedSingletonProviderWithSync();

		ModifiedExampleThread exampleThreadOne = new ModifiedExampleThread(modifiedSingletonProviderWithSync);
		ModifiedExampleThread exampleThreadTwo = new ModifiedExampleThread(modifiedSingletonProviderWithSync);
		ModifiedExampleThread exampleThreadThree = new ModifiedExampleThread(modifiedSingletonProviderWithSync);
		ModifiedExampleThread exampleThreadFour = new ModifiedExampleThread(modifiedSingletonProviderWithSync);
		
		exampleThreadOne.start();
		exampleThreadTwo.start();
		exampleThreadThree.start();
		exampleThreadFour.start();

	}

}
