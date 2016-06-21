package com.springboot.SpringAPP.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 * @author liuguo
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	@Scheduled(cron = "0/5 * * * * ?") // 每20秒执行一次
	public void sceduler(){
		System.out.println("定时任务》.....");
	}
}
