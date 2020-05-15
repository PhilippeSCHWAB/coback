
/**
 * This class CONTROLLER allows the CRUD on the setting table <b>ttesttool</b>
 */

package com.sample.postgress.controller;

import com.sample.postgress.Model.TTestTool;
import com.sample.postgress.service.TTestToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
    @RequestMapping("/api/outildetest")
@CrossOrigin("http://localhost:4200")
public class TTestToolController {


    @Autowired
    private com.sample.postgress.Repositoy.TTestToolRepository TTestToolRepository;


    @Resource
    TTestToolService toutildetestservice;


    @GetMapping
    public List<TTestTool> getTOutilDeTest(){
        System.out.println("get sur outildetest");
        return toutildetestservice.findAll();
    }


    @PostMapping
    public TTestTool create(@Valid @RequestBody TTestTool toutildetest) {
        System.out.println("post sur toutildetest : " + toutildetest);
        return toutildetestservice.save(toutildetest);
    }



    @PutMapping("/{toutilDeTestId}")
    public TTestTool saveTOutilDeTest(@Valid @RequestBody TTestTool toutildetest){
        System.out.println("post sur toutildetest : " + toutildetest);
        return toutildetestservice.save(toutildetest);
    }



    @GetMapping("/outildetest")
    public List<String> getOutildetest() {
        return (this.toutildetestservice.getOutildetest());
    }


    @DeleteMapping("/{tid}")
    public void delete(@PathVariable Long tid){
        System.out.println("delete sur entity : " + tid);
        this.toutildetestservice.delete(tid);
    }
}
