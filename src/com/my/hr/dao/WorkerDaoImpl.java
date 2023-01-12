package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.my.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao {
	private List<Worker> workers;
	Scanner sc = new Scanner(System.in);
	int sequenceNum;

	public WorkerDaoImpl(List<Worker> workers) {
		this.workers = workers;
	}

	@Override
	public List<Worker> selectWorkers() {
		return this.workers;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		this.workers.add(worker);
	}

	@Override
	public void updateWorkerName(String workerName, int sequenceNum) {
		this.workers.get(sequenceNum - 1).setWorkerName(workerName);
	}

	@Override
	public void updateWorkerJoinDate(LocalDate joinDate, int sequenceNum) {
		this.workers.get(sequenceNum - 1).setJoinDate(joinDate);
	}

	@Override
	public void deleteWorker() {
		this.workers.remove(sc.nextInt() - 1);
	}

}
