// 	***************************
// 	** Threads and Runnables **
// 	***************************
// 
// 	- we must always override 'run' method when creating a class that extends
// Thread or that implements Runnable;
//
//	- there are two ways to create Threads: extending the Thread class or
// implementing the Runnable interface. The second way is the most preferred;
//
//	- we can set the execution priority of a Thread by using the 'setPriority'
// method. The priority goes from 1 (high priority) to 10 (low priority). The
// default priority is 5;
//
// 	- the available methods are: run, start, sleep, getPriority, setPriority,
// join, isAlive, yield, interrupt, isInterrupted, setDaemon, isDaemon, getState...
//
public class Vehicle1 extends Thread {
	private String model;

	Vehicle1(String model) {
		this.setModel(model);
	}

	public String getModel() { return this.model; }
	public void setModel(String model) { this.model = model; }

	@Override
	public void run() {
		System.out.println("Thread Started by Vehicle 1: " + this.getModel());
	}
}

public class Vehicle2 implements Runnable {
	private String model;

	Vehicle2(String model) {
		this.setModel(model);
	}

	public String getModel() { return this.model; }
	public void setModel(String model) { this.model = model; }

	@Override
	public void run() {
		System.out.println("Thread Started by Vehicle 2: " + this.getModel());
	}
}

class Program {
	public static void main(String... args) {
		Vehicle1 ford = new Vehicle1("ford");
		ford.setPriority(10);
		ford.start();

		Thread wolkswagen = new Thread(new Vehicle2("wolkswagen"));
		wolkswagen.setPriority(1);
		wolkswagen.start();
	}
}