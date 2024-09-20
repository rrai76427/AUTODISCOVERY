/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsNeSnmpConfig;
import com.crl.nms.databases.NmsNeSnmpConfigPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Sneha Prajapati
 */

@Repository
public interface NmsNeSnmpConfigRepo extends JpaRepository<NmsNeSnmpConfig, NmsNeSnmpConfigPK> {

    Optional<NmsNeSnmpConfig> findBynmsNeSnmpConfigPK(NmsNeSnmpConfigPK nmsNeSnmpConfigPK);

    List<NmsNeSnmpConfig> findBynmsNeSnmpConfigPKProfileId(Short profileId);

    List<NmsNeSnmpConfig> findByNmsNeSnmpConfigPKNekey(String nekey);

    void deleteBynmsNeSnmpConfigPK(NmsNeSnmpConfigPK nmsNeSnmpConfigPK);
}
