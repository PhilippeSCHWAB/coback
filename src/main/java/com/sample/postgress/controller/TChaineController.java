package com.sample.postgress.controller;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.sample.postgress.entity.TChaine;
import com.sample.postgress.service.TChaineService;

@RestController
@RequestMapping("/postgresstchaine")
@CrossOrigin("http://localhost:4200")
//@CrossOrigin(origins = "*")
//@CrossOrigin("anonymous")
public class TChaineController {

    @Resource
    TChaineService tchaineService;

    @GetMapping("/tchaineList")
    public List<TChaine> getTChaine(){
        return tchaineService.findAll();
    }

    @PostMapping("/createtchain")
    public void createtchain(@RequestBody TChaine tchaine) {
        System.out.println("tchainecontroller :"+tchaine);
        tchaineService.createTChain(tchaine);
    }

    @DeleteMapping("/{ndlc}")
    public void deleteTChain(@PathVariable String ndlc) {
        this.tchaineService.deleteTChaine(ndlc);
    }


}
