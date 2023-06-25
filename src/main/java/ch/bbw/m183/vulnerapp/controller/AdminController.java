package ch.bbw.m183.vulnerapp.controller;

import ch.bbw.m183.vulnerapp.service.AdminService;
import ch.bbw.m183.vulnerapp.datamodel.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin123") // noone will ever guess!
@RequiredArgsConstructor
public class AdminController {

	private final AdminService adminService;

	@PostMapping("/create")
	public UserEntity createUser(UserEntity newUser) {
		return adminService.createUser(newUser);
	}

	@GetMapping("/users")
	public Page<UserEntity> getUsers(Pageable pageable) {
		return adminService.getUsers(pageable);
	}

	@DeleteMapping("/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		adminService.deleteUser(username);
	}
}
