package com.workout.scheduler.app.workout_scheduler_app;

import com.workout.scheduler.app.workout_scheduler_app.utils.EnvValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutSchedulerAppApplication {

	public static void main(String[] args) {
        EnvValidator.validateEnvVars();
        SpringApplication.run(WorkoutSchedulerAppApplication.class, args);
	}

}