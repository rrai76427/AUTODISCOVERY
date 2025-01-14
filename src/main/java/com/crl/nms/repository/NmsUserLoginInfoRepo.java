/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsUserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Sneha Prajapati
 */
@Repository
public interface NmsUserLoginInfoRepo extends JpaRepository<NmsUserLoginInfo, Integer> {

    Optional<Long> findBymobileNo(Long mobileNo);

    Optional<String> findByemail(String email);
}
