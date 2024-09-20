package com.crl.nms.repository;


import com.crl.nms.databases.NmsSnmpEnterPriseData;
import com.crl.nms.databases.NmsSnmpEnterPriseDataPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NmsSnmpEnterPriseDataRepo extends JpaRepository<NmsSnmpEnterPriseData, NmsSnmpEnterPriseDataPK> {

    List<NmsSnmpEnterPriseData> findBynmsSnmpEnterPriseDataPKNeKeyOrderByUpdatedOnDesc(String nekey);
}
