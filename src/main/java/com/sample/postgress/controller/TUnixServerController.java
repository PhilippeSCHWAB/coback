
/**
 * This class CONTROLLER allows the CRUD on the setting table <b>tserveurunix</b>
 */

package com.sample.postgress.controller;


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
public class TUnixServerController<tserveurUnixId> {



    @Autowired
    private com.sample.postgress.Repositoy.TUnixServerRepository TServeurUnixRepository;


    @Resource
    TUnixServerService tserveurunixService;


    @GetMapping
    public List<TUnixServer> getTServeurUnix(){
        System.out.println("get sur serveurunix");
        return tserveurunixService.findAll();
    }


    @PostMapping
    public TUnixServer createTServeurUnix(@Valid @RequestBody TUnixServer tserveurunix) {
        System.out.println("post sur tserveurunix : " + tserveurunix);
        return tserveurunixService.save(tserveurunix);
    }



    @PutMapping("/{tserveurUnixId}")
    public TUnixServer saveTServeurUnix(@Valid @RequestBody TUnixServer tserveurUnixServer){
        return tserveurunixService.save(tserveurUnixServer);
    }



    @GetMapping("/serveurunix")
    public List<String> getServeurunix() {
        return (this.tserveurunixService.getServeurunix());
    }


    @DeleteMapping("/{tid}")
    public void delete(@PathVariable Long tid){
        System.out.println("delete sur entity : " + tid);
        this.tserveurunixService.delete(tid);
    }

}
