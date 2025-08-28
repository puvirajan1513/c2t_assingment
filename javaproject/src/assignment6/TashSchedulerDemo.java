package assignment6;

public class TashSchedulerDemo {

	public static void main(String[] args) {
		
		Scheduler scheduler = new Scheduler();

        // Task 1: Print Hello every 2 seconds
        scheduler.scheduleTask(() -> System.out.println("Hello Task running..."), 2);

        // Task 2: Print Time every 3 seconds
        scheduler.scheduleTask(() -> System.out.println("Current Time: " + java.time.LocalTime.now()), 3);

        // Task 3: Print Goodbye every 5 seconds
        scheduler.scheduleTask(() -> System.out.println("Goodbye Task running..."), 5);

        // Keep program running for demonstration
        try {
            Thread.sleep(20000); // Run for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();

	}

}
