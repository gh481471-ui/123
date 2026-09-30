package com.example.CabBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CabBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CabBookingApplication.class, args);
    }
}

@RestController
@RequestMapping("/api/cabs")
class CabController {

    private final List<String> cl = new ArrayList<>(
        List.of("Cab Booking 1", "Cab Booking 2")
    );

    @GetMapping
    public List<String> getcl() {
        return cl;
    }

    @PostMapping
    public String addCab(@RequestBody String newCab) {
        cl.add(newCab);
        return "cab added successfully " + newCab;
    }

    @PutMapping("/{id}")
    public String updateCab(
            @PathVariable int id,
            @RequestBody String updatedCab) {

        if (id >= 0 && id < cl.size()) {
            cl.set(id, updatedCab);

            return "cab at index " + id +
                   " updated to " + updatedCab;
        }

        return "task not found";
    }

    @DeleteMapping("/{id}")
    public String deleteCab(@PathVariable int id) {

        if (id >= 0 && id < cl.size()) {
            String removed = cl.remove(id);

            return "deleted cab " + removed;
        }

        return "task not found";
    }
}
