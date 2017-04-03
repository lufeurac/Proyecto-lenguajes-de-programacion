package co.edu.javeriana.car;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Scheduler {
	private BlockingQueue<Action> actions = new ArrayBlockingQueue<Action>(1);

	public void schedule(Action action) {
		try {
			actions.put(action);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void executeNext() {
		Action nextAction;
		try {
			nextAction = actions.take();
			nextAction.execute();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
