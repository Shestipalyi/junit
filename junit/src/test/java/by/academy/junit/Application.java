package by.academy.junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class Application extends BlockJUnit4ClassRunner {

	private CalculatorTestListener listRun;

	public Application(Class<CalculatorTestListener> clz) throws InitializationError {
		super(clz);
		listRun = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(listRun);
		super.run(notifier);
	}
}
