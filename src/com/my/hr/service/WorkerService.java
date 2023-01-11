package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Worker;

public interface WorkerService {
	public List<Worker> getWorkers();
	public void addWorker(Worker worker);
	public void fixWorkerName(String workerName, int index);
	public void fixWorkerJoinDate(LocalDate joinDate, int index);
	public void delWorker();
}
