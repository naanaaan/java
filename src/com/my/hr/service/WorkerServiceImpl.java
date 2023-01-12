package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.dao.WorkerDao;
import com.my.hr.domain.Worker;

public class WorkerServiceImpl implements WorkerService {
	private WorkerDao workerDao;

	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	@Override
	public List<Worker> getWorkers() {
		return workerDao.selectWorkers();
	}

	@Override
	public void addWorker(Worker worker) {
		this.workerDao.insertWorker(worker);
	}

	@Override
	public void fixWorkerName(String workerName, int sequenceNum) {
		this.workerDao.updateWorkerName(workerName, sequenceNum);
	}

	@Override
	public void fixWorkerJoinDate(LocalDate joinDate, int sequenceNum) {
		this.workerDao.updateWorkerJoinDate(joinDate, sequenceNum);
	}

	@Override
	public void delWorker() {
		this.workerDao.deleteWorker();
	}

}
