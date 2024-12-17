/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NmsAlarms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Sneha Prajapati
 */
@Repository
public interface NmsAlarmsRepo extends JpaRepository<NmsAlarms, BigDecimal>, PagingAndSortingRepository<NmsAlarms, BigDecimal> {

/*
    List<NmsAlarms> findAllByOrderByFaultStatus();

    List<NmsAlarms> findAllByOrderByReceivingDateTimeDesc();

 ////   List<NmsAlarms> findByNekeyLikeAndReceivingDateTimeBetweenOrderByReceivingDateTime(String netype, Date startDate, Date endDate);

   // List<NmsAlarms> findByNekeyLikeAndReceivingDateTimeBetweenOrderByReceivingDateTimeDesc(String netype, Date startDate, Date endDate);


 //   List<NmsAlarms> findByNekeyAndAlarmIdAlarmIdAndReceivingDateTimeBetweenOrderByReceivingDateTime(String netype, short alarmId, Date startDate, Date endDate);

  //  List<NmsAlarms> findByNekeyAndAlarmIdAlarmIdAndReceivingDateTimeBetweenOrderByReceivingDateTimeDesc(String netype, short alarmId, Date startDate, Date endDate);

    List<NmsAlarms> findByNekeyAndReceivingDateTimeBetweenOrderByReceivingDateTime(String netype, Date startDate, Date endDate);

    List<NmsAlarms> findByNekeyAndReceivingDateTimeBetweenOrderByReceivingDateTimeDesc(String netype, Date startDate, Date endDate);

    //List<NmsAlarms> findByNekeyLikeAndAlarmIdAlarmIdAndReceivingDateTimeBetweenOrderByReceivingDateTime(String netype, short alarmId, Date startDate, Date endDate);

    List<NmsAlarms> findByNekeyLikeAndAlarmIdAlarmIdAndReceivingDateTimeBetweenOrderByReceivingDateTimeDesc(String netype, short alarmId, Date startDate, Date endDate);

    //List<NmsAlarms> findByalarmIdAlarmId(Short alarmId);

    List<NmsAlarms> findByFaultStatusIn(List<Short> faultList);

    List<NmsAlarms> findByFaultStatusInAndNodeIdIn(List<Short> faultList, List<Integer> NodeList);
*/

    // findByDataColumnBetweenOrderbyDateColumnAsc(Date startdate ,Date enddate)

}
