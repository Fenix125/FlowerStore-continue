package com.example.demo.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class FlowerController {
	@GetMapping("/flowers")
	public List<Flower> getAllFlowers(){
		return List.of(new Flower(FlowerColor.RED, 60, 80.5, FlowerType.ROSE));
	}

}
