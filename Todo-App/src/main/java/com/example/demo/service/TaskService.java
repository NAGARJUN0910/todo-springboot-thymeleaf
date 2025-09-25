package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository repo;

	public TaskService(TaskRepository repo) {
		this.repo = repo;
	}

	public List<Task> findAll() {
		return repo.findAll();
	}

	public Task save(Task task) {
		return repo.save(task);
	}

	public Task findById(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
