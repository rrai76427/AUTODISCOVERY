package com.crl.nms.repository;

import com.crl.nms.databases.AuthenticationProtocolEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationProtocolEnumRepo extends JpaRepository<AuthenticationProtocolEnum,Integer> {
}
