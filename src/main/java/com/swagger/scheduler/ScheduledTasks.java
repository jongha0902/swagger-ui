package com.swagger.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
 
/**
 * Scheduled tasks
 *
 * @author Brient Oh
 */
@Component
public class ScheduledTasks {
	
//	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
 
//	@Scheduled(fixedRate = 5000)
//	public void helloWorldTask() {
//		System.out.println("Fxied rate every 5 second " + dateFormat.format(new Date()));
//	}
//	
//	@Scheduled(cron = "0/10 * * * * *")
//	public void runEvery10Sec() {
//		System.out.println("Cron expression - Run every 10 second - " + dateFormat.format(new Date()));
//	}
}