/**
 * 
 */
package testing.gopal.singletons.multithreaded;

import testing.gopal.singletons.multithreaded.SingletonProviderWithSync.SingletonThreaded;

/**
 * @author gjhunjhunwala
 * 
 */
public class ExampleThread extends Thread {
	SingletonProviderWithSync singletonProviderWithSync;

	public ExampleThread(SingletonProviderWithSync singletonProviderWithSync) {
		this.singletonProviderWithSync = singletonProviderWithSync;
	}

	@Override
	public void run() {
		while(true) {
			SingletonThreaded object = singletonProviderWithSync.getInstance();
			singletonProviderWithSync.printStats();
			System.out.println(object);
		}
	}

}
