package com.bootcamp.reto.web.controller;

import com.bootcamp.reto.domain.dto.SimuladorDto;
import com.bootcamp.reto.domain.dto.SimuladorResponse;
import com.bootcamp.reto.domain.services.SimuladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("simulador")
public class SimuladoriesController {

    @Autowired
    private SimuladorService simuladorService;

    private SimuladoriesController(){
    }

    @GetMapping("")
    List<SimuladorDto> findAll(){
        return this.simuladorService.findAll();
    }

    @GetMapping("/{id}")
    SimuladorDto findById(@PathVariable("id") Integer id){
        return this.simuladorService.findById(id);
    }

    @PostMapping("/simulate")
    ResponseEntity<SimuladorResponse> simulate(@RequestBody() SimuladorDto simuladorDto){
        SimuladorResponse simuladorResponse= new SimuladorResponse();
      // return new ResponseEntity<>(this.productService.save(productDto), HttpStatus.CREATED);
        return new ResponseEntity<>(this.simuladorService.simulate(simuladorDto), HttpStatus.OK);

    }

}
