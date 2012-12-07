/**
 * 
 */
package testing.gopal.singletons.modifiedmultithreaded;

import testing.gopal.singletons.modifiedmultithreaded.ModifiedSingletonProviderWithSync.SingletonThreadedModified;

/**
 * @author gjhunjhunwala
 *
 */
public class ModifiedExampleThread extends Thread {
	
	ModifiedSingletonProviderWithSync modifiedSingletonProviderWithSync = new ModifiedSingletonProviderWithSync();
	
	public ModifiedExampleThread(ModifiedSingletonProviderWithSync modifiedSingletonProviderWithSync) {
		this.modifiedSingletonProviderWithSync = modifiedSingletonProviderWithSync;
	}
	
	@Override
	public void run() {
		while(true) {
			SingletonThreadedModified object = modifiedSingletonProviderWithSync.getInstance();
			modifiedSingletonProviderWithSync.printStats();
			System.out.println(object);
		}
	}

}
