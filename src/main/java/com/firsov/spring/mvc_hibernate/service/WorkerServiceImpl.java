package com.firsov.spring.mvc_hibernate.service;

import com.firsov.spring.mvc_hibernate.dao.WorkerDAO;
import com.firsov.spring.mvc_hibernate.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{

    @Autowired
    private WorkerDAO workerDAO;

    @Override
    @Transactional
    public List<Worker> getAllWorkers() {
        return workerDAO.getAllWorkers();
    }

    @Override
    @Transactional
    public void saveNewWorker(Worker worker) {
        workerDAO.saveNewWorker(worker);
    }

    @Override
    @Transactional
    public Worker getWorker(int id) {
        Worker worker = workerDAO.getWorker(id);

        return worker;

    }

    @Override
    @Transactional
    public void deleteWorker(int id) {
        workerDAO.deleteWorker(id);
    }
}
