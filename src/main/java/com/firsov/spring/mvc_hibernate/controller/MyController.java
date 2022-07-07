package com.firsov.spring.mvc_hibernate.controller;

import com.firsov.spring.mvc_hibernate.entity.Worker;
import com.firsov.spring.mvc_hibernate.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping("/")
    public String showAllWorkers(Model model) {

        List<Worker> workers = workerService.getAllWorkers();


        model.addAttribute("workers", workers);

        return "all-workers";
    }

    @RequestMapping("/add_worker")
    public String addWorker(Model model) {

        Worker worker = new Worker();
        model.addAttribute("worker", worker);
        return "add-worker";
    }

    @RequestMapping("/save_new_worker")
    public String saveNewWorker(@ModelAttribute("worker") Worker worker) {
        workerService.saveNewWorker(worker);


        return "redirect:/";
    }

    @RequestMapping("/update_worker")
    public String updateWorker(@RequestParam("workerId") int id, Model model) {

        Worker worker = workerService.getWorker(id);
        model.addAttribute("worker", worker);
        return "add-worker";
    }

    @RequestMapping("/delete_worker")
    public String deleteWorker(@RequestParam("workerId") int id){
        workerService.deleteWorker(id);

        return "redirect:/";
    }
}
