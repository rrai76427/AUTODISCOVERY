package com.crl.nms.repository;

import com.crl.nms.databases.AuthenticationProtocolEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationProtocolEnumRepo extends JpaRepository<AuthenticationProtocolEnum, Integer> {
}
