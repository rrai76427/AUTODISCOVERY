/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package com.crl.nms.repository;


import java.util.List;

import com.crl.nms.databases.NmsNeCpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

*/
/**
 *
 * @author Sneha Prajapati
 *//*

@Repository
public interface NmsNeCpuRepo extends JpaRepository<NmsNeCpu, String>{
    
    List<NmsNeCpu> findBynekeyNekey(String nekey);
    
    List<NmsNeCpu> findAllByOrderByUpdatetime();
    
    List<NmsNeCpu> findAllByOrderByUpdatetimeDesc();
    //List<Object[]> findTopByNekeyNekeyOrderByCpuPercentusageDesc(NmsNeCpu val);
}
*/
