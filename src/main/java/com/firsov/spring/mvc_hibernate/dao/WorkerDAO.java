package com.firsov.spring.mvc_hibernate.dao;

import com.firsov.spring.mvc_hibernate.entity.Worker;

import java.util.List;

public interface WorkerDAO {
    public List<Worker> getAllWorkers();

    public void saveNewWorker(Worker worker);

    public Worker getWorker(int id);

    public void deleteWorker(int id);
}
