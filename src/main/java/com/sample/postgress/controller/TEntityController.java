
/**
 * This class CONTROLLER allows the CRUD on the setting table <b>tentity</b>
 */

package com.sample.postgress.controller;

import com.sample.postgress.Model.TEntity;
import com.sample.postgress.service.TEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/entity")
@CrossOrigin("http://localhost:4200")
public class TEntityController {


    @Autowired
    private com.sample.postgress.Repositoy.TEntityRepository TEntityRepository;


    @Resource
    TEntityService tentityService;


    @GetMapping
    public List<TEntity> getTEntity() {
        System.out.println("get sur entity");
        return tentityService.findAll();
    }


    @PostMapping
    public TEntity createTEntity(@Valid @RequestBody TEntity tentity) {
        System.out.println("post sur entity : " + tentity);
        return tentityService.save(tentity);
    }


    @PutMapping("/{tentityId}")
    public TEntity saveTEntity(@Valid @RequestBody TEntity tentity) {
        return tentityService.save(tentity);
    }



    @GetMapping("/entity")
    public List<String> getEntite() {
        return (this.tentityService.getEntite());
    }


    @DeleteMapping("/{tid}")
    public void deleteTEntity(@PathVariable Long tid){
        System.out.println("delete sur entity : " + tid);
        this.tentityService.deleteTEntity(tid);
    }

}
