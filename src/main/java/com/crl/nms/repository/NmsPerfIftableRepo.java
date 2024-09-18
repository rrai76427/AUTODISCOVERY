/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsPerfIftable;
import com.crl.nms.databases.NmsPerfIftablePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sneha Prajapati
 */
@Repository
public interface NmsPerfIftableRepo extends JpaRepository<NmsPerfIftable, NmsPerfIftablePK>{
    
}
