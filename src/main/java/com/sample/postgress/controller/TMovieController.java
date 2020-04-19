package com.sample.postgress.controller;

import com.sample.postgress.Model.Movie;
import com.sample.postgress.Repositoy.MovieRepository;
import com.sample.postgress.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin("http://localhost:4200")
public class TMovieController {


    @Autowired
    private MovieRepository MovieRepository;


    @Resource
    MovieService movieservice;


   @GetMapping
    public List<Movie> getTUserList(){
       return movieservice.findAll();
    }


    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieservice.createMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }


/*

    @GetMapping("/{tid}")
    public Optional<TUser> FilteredUser(@PathVariable long tid) {
        System.out.println("tusercontroler yyyy: " +tid);
      //  this.tuserService.FilteredUser((int) tid);
        return tuserService.FilteredUser(tid);
    }

    @PostMapping
    public ResponseEntity<TUser> createTuser(@RequestBody TUser tuser) {
            TUser savedTUser = tuserService.createTUser(tuser);
        return ResponseEntity.ok(savedTUser);
    }



    @PutMapping("/{id}")
    public ResponseEntity<TUser> updateTUser(@PathVariable Long id,@RequestBody TUser tuserToUpdate ) {
        ResponseEntity<TUser> tuserResponse = tuserService.updateTUser(id,tuserToUpdate);
        return tuserResponse;
    }



    @DeleteMapping("/{tid}")

    public void deleteUser(@PathVariable Long tid)
    { System.out.println("tusercontroler : " +tid);
        this.tuserService.deleteUser(tid);
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
