package com.my.hr.test;

import java.util.ArrayList;

import com.my.hr.dao.WorkerDao;
import com.my.hr.dao.WorkerDaoImpl;
import com.my.hr.domain.Worker;

public class WorkerDaoTest {
	public static void main(String[] args) {
		WorkerDao workerDao = new WorkerDaoImpl(new ArrayList<Worker>());
		
	}
}
