
/**
 * This class CONTROLLER allows the CRUD on the setting table <b>tserveurunix</b>
 */

package com.sample.postgress.controller;


import com.sample.postgress.Employee;
import com.sample.postgress.Model.TUnixServer;

import com.sample.postgress.service.TUnixServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/serveurunix")
@CrossOrigin("http://localhost:4200")
public class TUnixServerController<tUnixServerId> {



    @Autowired
    private com.sample.postgress.Repositoy.TUnixServerRepository TUnixServerRepository;


    @Resource
    TUnixServerService tUnixServerService;

    /**
     * Get de list table unixserveur for form tunixserver >
     */
    @GetMapping
    public List<TUnixServer> getTUnixServer(){
        System.out.println("get sur TunixServer");
        return tUnixServerService.findAll();
    }


    @PostMapping
    public TUnixServer create(@Valid @RequestBody TUnixServer tUnixServer) {
        System.out.println("post sur TunixServer : " + tUnixServer);
        return tUnixServerService.save(tUnixServer);
    }



    @PutMapping("/{tserveurUnixId}")
    public TUnixServer save(@Valid @RequestBody TUnixServer tUnixServer){
        return tUnixServerService.save(tUnixServer);
    }



    /**
     * Get de list of only name unixserveur for form create user >
     */
    @GetMapping("/serveurunix")
    public List<String> getUnixServerListOnly() {
        return (this.tUnixServerService.getUnixServerOnly());
    }


    @DeleteMapping("/{tid}")
    public void delete(@PathVariable Long tid){
        System.out.println("delete sur entity : " + tid);
        this.tUnixServerService.delete(tid);
    }

    @GetMapping("/serveurunx")
    public List<TUnixServer> getAllTUnixServers() {
        return tUnixServerService.getAllTUnixServers();
    }

}
