package com.sample.postgress.controller;

import com.sample.postgress.entity.TAccesAuxChaines;
import com.sample.postgress.entity.TUser;
import com.sample.postgress.service.TAccesAuxChainesService;
import com.sample.postgress.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/postgressTAccesAuxChaines")
@CrossOrigin("http://localhost:4200")



public class TAccesAuxChainesController {


    @Resource
    TAccesAuxChainesService taccesAuxChainesService;

    @GetMapping(value = "/taccesAuxChainesList")
    public List<TAccesAuxChaines> getTAccesAuxChaines() {
        return taccesAuxChainesService.findAll();
    }

    @PostMapping(value = "/createTAccesAuxChaines")
    public void createTAccesAuxChaines(@RequestBody TAccesAuxChaines taccesAuxChaines) {
        taccesAuxChainesService.createTAccesAuxChaines(taccesAuxChaines);
    }



/*
    @PutMapping(value = "/updateTAccesAuxChaines/{id}")
    public void updateTAccesAuxChaines(@RequestBody TAccesAuxChaines taccesAuxChaines) {
        taccesAuxChainesService.updateTAccesAuxChaines(taccesAuxChaines);
    }


    @DeleteMapping("/{id}")
    public void deleteAccesAuxChaines(@PathVariable String id) {
        //  System.out.println("taccesAuxChainescontroler : " +id);
        this.taccesAuxChainesService.deleteTAccesAuxChaines(id);
    }

    @GetMapping("/filter/{id}")
    public List<TAccesAuxChaines> FilteredAccesAuxChaines(@PathVariable String id) {
        System.out.println("taccesAuxChainescontroler : " + id);
        this.taccesAuxChainesService.FilteredTAccesAuxChaines(id);
        return taccesAuxChainesService.FilteredTAccesAuxChaines(id);
*/
}
