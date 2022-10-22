package com.example.demo.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.entity.UserEntity;
import com.example.demo.crud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	// @Autowired
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;

	}

	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity userEntity) {
		return this.userService.createUser(userEntity);
	}

	@GetMapping
	public List<UserEntity> getUserAll() {
		return this.userService.getUserAll();
	}

	@PutMapping("/{id}")
	public UserEntity updateUser(@RequestBody UserEntity userEntity, @PathVariable Integer id) {
		return this.userService.updateUser(userEntity, id);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		this.userService.deleteUser(id);
	}
}
