package com.HomeWork.Task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(
        path = {"/store/order"}
)
public class Controller {
    private final Servis servis;

    public Controller(Servis servis) {
        this.servis = servis;
    }

    @GetMapping(
            path = {"/add"}
    )
    public void add(@RequestParam Integer ID) {
        this.servis.add(ID);
    }

    @GetMapping(
            path = {"/get"}
    )
    public Collection<Integer> getAllNumbers() {
        return this.servis.get();
    }
}
