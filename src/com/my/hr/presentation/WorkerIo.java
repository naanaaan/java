package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.my.hr.domain.Worker;
import com.my.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;

	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}

	public void play() {
		boolean isGood = false;
		
		do {
			int inMenu = Console.inMenuNum("1.목록, 2.추가, 3수정, 4삭제, 0.종료\n> ");
			switch (inMenu) {
			case 0 -> {
				Console.info("앱을 종료합니다.");
				break;
			}
			case 1 -> {
				if (workerService.getWorkers().size() == 0) Console.err("노동자가 없습니다.");
				else {
					Console.info("순서   Id    노동자명    입사일\n");
					int i = 1;
					List<Worker> workers = workerService.getWorkers();
					for(Worker worker: workers) {
						Console.info(i++ + "      ");
						Console.info(worker + "\n");
					}
				}
			}
			case 2 -> {
				String inWorkerName = Console.inName("노동자의 이름을 입력하세요.\n>");
				LocalDate inJoinDate = Console.inJoinDate2();
				workerService.addWorker(new Worker(inWorkerName, inJoinDate));
				Console.info("노동자를 추가했습니다.\n");
			}
			case 3 -> {
				Console.info("몇 번째를 수정하시겠습니까?\n>");
				int sequencNum = Console.inNum();
				String inWorkerName = Console.inName("노동자의 이름을 입력하세요.\n>");
				LocalDate inJoinDate = Console.inJoinDate();
				workerService.fixWorkerName(inWorkerName, sequencNum);
				workerService.fixWorkerJoinDate(inJoinDate, sequencNum);	
			}
			case 4 -> {
				Console.info("몇 번째를 삭제하시겠습니까?\n>");
				try {
					workerService.delWorker();
				} catch (IndexOutOfBoundsException e) {
					Console.err("존재하는 노동자가 없습니다.");
				}
			}
			}
		} while (!isGood);
	}
}
