/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import java.util.List;

import com.crl.nms.databases.SnmpProfileTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sneha Prajapati
 */
@Repository
public interface SnmpProfileTemplateRepo extends JpaRepository<SnmpProfileTemplate, Short> {
    List<SnmpProfileTemplate> findByprofileName(String profileName);
}
