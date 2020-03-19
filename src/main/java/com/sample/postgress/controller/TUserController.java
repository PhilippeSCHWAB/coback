package com.sample.postgress.controller;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.sample.postgress.entity.TUser;
import com.sample.postgress.service.TUserService;

@RestController
@RequestMapping("/postgressTlist")
@CrossOrigin("http://localhost:4200")
public class TUserController {

    @Resource
    TUserService tuserService;

    @GetMapping(value = "/tuserList")
    public List<TUser> getTUser(){
    		return tuserService.findAll();
    }

    @PostMapping(value = "/createTUser")
    public void createTUser(@RequestBody TUser tuser) {
        tuserService.createTUser(tuser);    }


    @PutMapping(value = "/updateTUser/{tuid}")
    public void updateTUser(@RequestBody TUser tuser) {
        tuserService.updateTUser(tuser);    }


  @DeleteMapping("/{tuid}")
    public void deleteUser(@PathVariable String tuid) {
      //  System.out.println("tusercontroler : " +tuid);
        this.tuserService.deleteUser(tuid);
    }

    @GetMapping("/filter/{tuid}")
    public List<TUser> FilteredUser(@PathVariable String tuid) {
       System.out.println("tusercontroler : " +tuid);
        this.tuserService.FilteredUser(tuid);
            return tuserService.FilteredUser(tuid);
        }

    // /postgressTlist/tuserList"



/*
    @GetMapping("/filter")
    public List<TUser> getFilteredUserList(@RequestParam String iudSelectedForm) {
        System.out.println("tusercontroler : " +iudSelectedForm);
           return tuserService.getFilteredUserList(iudSelectedForm);
}
*/

     /*
    @PutMapping(value = "/executeUpdateTUser")
    public void executeUpdateTUser(@RequestBody TUser tuser) {
        tuserService.executeUpdateTUser(tuser);

    }


    @DeleteMapping(value = "/deleteTUserById")
    public void deleteTUser(@RequestBody TUser tuser) {
        tuserService.deleteTUser(tuser);
*/
/*
        @DeleteMapping(value = "/deleteTUserById/{tiud}")
        public void deleteTUser(@PathVariable String tuid) {
            this.tuserService.deleteTUser(tuid);
*/


}
