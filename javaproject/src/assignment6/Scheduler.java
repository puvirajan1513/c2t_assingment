package assignment6;
import java.util.concurrent.*;

public class Scheduler {
	private final ScheduledExecutorService Tscheduler = Executors.newScheduledThreadPool(1);
	
	public void scheduleTask(Task task , int intervalInSecond) {
		Tscheduler.scheduleAtFixedRate(() -> task.exceute(),0,intervalInSecond,TimeUnit.SECONDS);
		
	}
	public void shutdown() {
		Tscheduler.shutdown();
	}
}
