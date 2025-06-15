package com.cmjd.lostfound.controller;

import com.cmjd.lostfound.model.Request;
import com.cmjd.lostfound.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;

    // Submit a new request
    @PostMapping
    public Request submitRequest(@RequestBody Request request) {
        return requestRepository.save(request);
    }

    // Get all requests
    @GetMapping
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    // (Optional) Get a request by ID
    @GetMapping("/{id}")
    public Request getRequestById(@PathVariable Long id) {
        return requestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found with id " + id));
    }
}
