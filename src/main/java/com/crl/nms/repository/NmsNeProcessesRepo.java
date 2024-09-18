/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsNeProcesses;
import com.crl.nms.databases.NmsNeProcessesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Sneha Prajapati
 */
@Repository
public interface NmsNeProcessesRepo extends JpaRepository<NmsNeProcesses, NmsNeProcessesPK>{

    List<NmsNeProcesses> findByNmsNeProcessesPKNekeyAndProcnoLessThanEqual(String nekey, Integer procno);

    List<NmsNeProcesses> findByNmsNeProcessesPKNekeyAndProcnoGreaterThan(String nekey, Integer procno);
    
}
