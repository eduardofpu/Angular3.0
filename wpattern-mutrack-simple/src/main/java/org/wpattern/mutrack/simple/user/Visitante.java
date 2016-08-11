package org.wpattern.mutrack.simple.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpattern.mutrack.simple.permission.PermissionEntity;
import org.wpattern.mutrack.simple.permission.PermissionRepository;
import org.wpattern.mutrack.simple.security.CurrentUser;
import org.wpattern.mutrack.simple.userpermission.UserPermissionEntity;
import org.wpattern.mutrack.simple.userpermission.UserPermissionKey;
import org.wpattern.mutrack.simple.userpermission.UserPermissionRepository;
import org.wpattern.mutrack.simple.utils.GenericService;
import org.wpattern.mutrack.simple.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.VISITANTES_PATH)
public class Visitante extends GenericService<UserEntity, Long> {

	@Autowired
	private CurrentUser currentUser;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	PermissionRepository permissaoRepository;

	@Autowired
	UserPermissionRepository userPermission;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserEntity insert(@RequestBody UserEntity user) {

		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		this.userRepository.saveAndFlush(user);

		PermissionEntity permissao = this.permissaoRepository.findByRole("ROLE_USER");

		if (permissao == null) {
			PermissionEntity permissao2 = new PermissionEntity();
			permissao2.setRole("ROLE_USER");

			permissao = this.permissaoRepository.save(permissao2);
		}
		UserPermissionKey userPermissionKey = new UserPermissionKey();
		userPermissionKey.setPermissionId(permissao.getId());
		userPermissionKey.setUserId(user.getId());

		UserPermissionEntity userPermission = new UserPermissionEntity();
		userPermission.setId(userPermissionKey);

		this.userPermission.save(userPermission);

		return this.userRepository.saveAndFlush(user);

	}

}
