package com.crl.nms.repository;

import com.crl.nms.databases.PrivacyProtocolEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivacyProtocolEnumRepo extends JpaRepository<PrivacyProtocolEnum,Integer> {
}
