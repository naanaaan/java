package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Worker;


public interface WorkerDao {
	public List<Worker> selectWorkers();
	public void insertWorker(Worker worker);
	public void updateWorkerName(String workerName, int sequenceNum);
	public void updateWorkerJoinDate(LocalDate joinDate, int sequenceNum);
	public void deleteWorker();
}
