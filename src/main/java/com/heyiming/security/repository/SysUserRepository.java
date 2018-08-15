package com.heyiming.security.repository;

import com.heyiming.security.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {

	SysUser findByUsername(String username);

}
