package net.example.jwtappdemo.rest;

import net.example.jwtappdemo.dto.UserDto;
import net.example.jwtappdemo.model.User;
import net.example.jwtappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/admin/")
public class AdminRestControllerV1 {
    @Autowired
    private UserService userService;

    @GetMapping(value = "users/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable(name = "id") Long id) {
        User result = userService.findById(id);

        if (result == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    //TODO 1.16
        return new ResponseEntity<>(UserDto.fromUser(result), HttpStatus.OK);
    }
}
