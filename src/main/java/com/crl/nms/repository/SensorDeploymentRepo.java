/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package com.crl.nms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

*/
/**
 * @author Sneha Prajapati
 *//*

@Repository
public interface SensorDeploymentRepo extends JpaRepository<SensorDeployment, Integer> {

    List<SensorDeployment> findBysensorParentNodeId(Integer sensorParentNodeId);
}
*/
