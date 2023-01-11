package com.my.hr.domain;

import java.time.LocalDate;

public class Worker {
	private final int workerId;
	private static int IdStardNum = 1;
	private String workerName;
	private LocalDate joinDate;

	public Worker(String workerName, LocalDate joinDate) {
		this.workerId = Worker.IdStardNum++;
		this.workerName = workerName;
		this.joinDate = joinDate;
	}
	
	
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s", this.workerId, this.workerName, this.joinDate);
	}
}
