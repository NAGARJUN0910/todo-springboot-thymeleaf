package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Task;
import com.example.demo.service.TaskService;

import org.springframework.ui.Model;


@Controller
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", service.findAll());
        model.addAttribute("task", new Task());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        service.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }

    @GetMapping("/complete/{id}")
    public String completeTask(@PathVariable Long id) {
        Task task = service.findById(id);
        task.setCompleted(true);
        service.save(task);
        return "redirect:/";
    }
}
