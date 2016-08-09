package org.wpattern.mutrack.simple.userpermission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermissionEntity, UserPermissionKey> {
	
	public UserPermissionEntity findById(Long id);

}
