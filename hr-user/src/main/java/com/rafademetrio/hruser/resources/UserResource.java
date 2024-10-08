package com.rafademetrio.hruser.resources;

import com.rafademetrio.hruser.entities.User;
import com.rafademetrio.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    //TODO implement email not found
    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User obj = repository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }


}
