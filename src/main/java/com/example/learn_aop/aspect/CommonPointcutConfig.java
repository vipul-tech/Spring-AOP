package com.example.learn_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	@Pointcut("execution(* com.example.learn_aop.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.example.learn_aop.buisness.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.example.learn_aop.data.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}
	
	@Pointcut("@annotation(com.example.learn_aop.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}
