package com.workout.scheduler.app.workout_scheduler_app.utils;

import com.workout.scheduler.app.workout_scheduler_app.exceptions.EnvConfigurationException;
import java.util.List;

public class EnvValidator {

    private EnvValidator() {}

    public static void validateEnvVars() {
        List<String> requiredVars = List.of(
                "DB_URL", "DB_USERNAME", "DB_PASSWORD",
                "JWT_SECRET", "JWT_EXPIRATION",
                "MAIL_USERNAME", "MAIL_PASSWORD"
        );

        requiredVars.forEach(varName -> {
            if (System.getenv(varName) == null)
                throw new EnvConfigurationException("Variable de entorno requerida: " + varName);
        });
    }
}