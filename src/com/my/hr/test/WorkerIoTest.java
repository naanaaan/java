package com.my.hr.test;

import java.util.ArrayList;

import com.my.hr.dao.WorkerDao;
import com.my.hr.dao.WorkerDaoImpl;
import com.my.hr.domain.Worker;
import com.my.hr.presentation.WorkerIo;
import com.my.hr.service.WorkerService;
import com.my.hr.service.WorkerServiceImpl;

public class WorkerIoTest {
	public static void main(String[] args) {
		WorkerDao workerDao = new WorkerDaoImpl(new ArrayList<Worker>());
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		workerIo.play();
		
	}
}
