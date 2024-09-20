/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsNeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sneha Prajapati
 */
@Repository
public interface NmsNeDetailRepository extends JpaRepository<NmsNeDetail, String> {

    @Query("SELECT neType," +
            "COUNT(neType) AS NeTypeCount, " +
            "SUM(CASE WHEN neStatus = 1 THEN 1 ELSE 0 END) AS neStatusUpCount, " +
            "SUM(CASE WHEN neStatus = 2 THEN 1 ELSE 0 END) AS neStatusDownCount " +
            "FROM NmsNeDetail " +
            "GROUP BY  neType")
    List<Object[]> getNeTypeStatusCountsByHostNodeID();

    NmsNeDetail findByneDesc(String deviceName);

    List<NmsNeDetail> findByneIp(String deviceIP);

    List<NmsNeDetail> findByneTypeNeType(Short deviceType);


    List<NmsNeDetail> findByneStatus(Short neStatus);

    List<NmsNeDetail> findByNodeIdIn(List<Integer> nodeList);

    List<NmsNeDetail> findByNodeId(Integer nodeId);

    List<String> findNeDescBynekey(String nekey);

    // List<Object[]>findNeDetails();

    public void deleteByNeIp(String Src_ip);


    @Modifying
    @Query("UPDATE NmsNeDetail ne SET ne.neDesc = :deviceName WHERE ne.neIp = :ip AND ne.neDesc = 'null'")
    void updateNeDescByIp(String deviceName, String ip);


    @Modifying
    @Query("UPDATE NmsNeDetail ne SET ne.neDesc = :deviceName WHERE ne.neDesc = :ip")
    void updateNeDescByIP(String deviceName, String ip);

}
