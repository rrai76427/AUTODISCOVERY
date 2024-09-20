/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.LinkMediaDetails;
import com.crl.nms.databases.LinkMediaDetailsPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sneha Prajapati
 */
public interface LinkMediaDetailsRepo extends JpaRepository<LinkMediaDetails, LinkMediaDetailsPK> {

}
