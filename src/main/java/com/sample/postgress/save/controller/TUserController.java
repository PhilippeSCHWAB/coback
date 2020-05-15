
/**
 * This class CONTROLLER allows the CRUD on the main table <b>tchain</b>
 */

package com.sample.postgress.controller;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import com.sample.postgress.Model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sample.postgress.service.TUserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("http://localhost:4200")
public class TUserController {


    @Autowired
    private com.sample.postgress.Repositoy.TUserRepository TUserRepository;


    @Resource
    TUserService tuserService;

   @GetMapping
    public List<TUser> getTUserList(){
       return tuserService.findAll();
    }

    @GetMapping("/{tid}")
    public Optional<TUser> getFilteredUser(@PathVariable int tid) {
        System.out.println("tusercontroler yyyy: " +tid);
      //  this.tuserService.FilteredUser((int) tid);
        return tuserService.getFilteredUser(tid);
    }

    @PostMapping
    public ResponseEntity<TUser> createTuser(@RequestBody TUser tuser) {
        System.out.println("@PostMapping zzzz: " +tuser);
            TUser savedTUser = tuserService.createTUser(tuser);
        return ResponseEntity.ok(savedTUser);
    }



    @PutMapping("/{id}")
    public ResponseEntity<TUser> updateTUser(@PathVariable int id,@RequestBody TUser tuserToUpdate ) {
        ResponseEntity<TUser> tuserResponse = tuserService.updateTUser(id,tuserToUpdate);
        return tuserResponse;
    }



    @DeleteMapping("/{tid}")
    public void deleteTUser(@PathVariable int tid)
    { System.out.println("tusercontroler : " +tid);
        this.tuserService.deleteTUser(tid);
    }

    /*
    @GetMapping("/filter")
    public Optional<TUser> getFilteredUser(@RequestParam int iudSelectedForm) {
        System.out.println("tusercontroler : " +iudSelectedForm);
        return tuserService.getFilteredUser(iudSelectedForm);
    }
*/

/*##############    ok
    @PostMapping
    public TUser createtuser(@Valid @RequestBody TUser tuser) {
        return TUserRepository.save(tuser);
    }
 */


/*
    @GetMapping("/filter/{tuid}")
    public Optional<TUser> FilteredUser(@PathVariable long tuid) {
        System.out.println("tusercontroler : " +tuid);
        this.tuserService.FilteredUser(tuid);
        return tuserService.FilteredUser(tuid);
    }

*/

/*
    @PostMapping(value = "/createTUser")
    public void createTUser(@RequestBody TUser tuser) {
        tuserService.createTUser(tuser);    }
*/
/*
    @PostMapping
    public TUser createTUser(@Valid @RequestBody TUser tuser) {
        return TUserRepository.save(tuser);
    }


    @PutMapping(value = "/updateTUser/{tuid}")
    public void updateTUser(@RequestBody TUser tuser) {
        tuserService.updateTUser(tuser);    }


  @DeleteMapping("/{tuid}")
    public void deleteUser(@PathVariable String tuid) {
      //  System.out.println("tusercontroler : " +tuid);
        this.tuserService.deleteUser(tuid);
    }

/*


    @GetMapping("/filter")
    public List<TUser> getFilteredUserList(@RequestParam String iudSelectedForm) {
        System.out.println("tusercontroler : " +iudSelectedForm);
        return tuserService.getFilteredUserList(iudSelectedForm);
    }
    */
/*
    @PostMapping
    public ResponseEntity<TUser> createTUser(/*@Valid @RequestBody*/ /*TUser tuserToCreate) {
        TUser savedTUser = tuserService.createTUser(tuserToCreate);
        System.out.println("XXXX :" +   savedTUser.getIud());
        return ResponseEntity.ok(savedTUser);

    }

    */


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
