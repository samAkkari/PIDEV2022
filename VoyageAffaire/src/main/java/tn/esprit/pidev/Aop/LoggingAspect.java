package tn.esprit.pidev.Aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger l = LogManager.getLogger(LoggingAspect.class);

	@AfterReturning("execution(* tn.esprit.pidev.services.*.*(..))")
	public void logMethodExit1(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("méthode exécutée avec succès : " + name);
	}

}
