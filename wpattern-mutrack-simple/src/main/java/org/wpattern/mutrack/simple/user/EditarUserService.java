package org.wpattern.mutrack.simple.user;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpattern.mutrack.simple.security.CurrentUser;
import org.wpattern.mutrack.simple.utils.GenericService;
import org.wpattern.mutrack.simple.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.EDITUSER_PATH)
public class EditarUserService extends GenericService<UserEntity, Long> {
	@Autowired
	private CurrentUser currentUser;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public List<UserEntity> findAll() {
		UserEntity user = this.userRepository.findByEmail(currentUser.getActiveUser().getEmail());

		return this.userRepository.findById(user.getId());
	}

	@Override
	public UserEntity insert(@RequestBody UserEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		return super.insert(user);
	}

	@Override
	public void update(@RequestBody UserEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		super.update(user);
	}
	
	
	
	
	
	
}
