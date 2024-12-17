package com.crl.nms.repository;

import com.crl.nms.databases.IfIndex;
import com.crl.nms.databases.IfIndexPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IfIndexRepo extends JpaRepository<IfIndex, IfIndexPK> {
/*    Optional<IfIndex>findBySrcport(short srcport);
    Optional<IfIndex> findByDescport(short descport);*/
}
