package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String get(Model model) {
        Car car = new Car("porshe", "918 spyder");
        Car car1 = new Car("porshe", "928 spyder");
        Car car2 = new Car("porshe", "938 spyder");
        Car car3 = new Car("porshe", "948 ");

        List<Car> cars = new ArrayList<>(List.of(car, car1, car2, car3));

        model.addAttribute("name", "daniel");

        model.addAttribute("cars", cars);
        return "hello";
    }

}
