package com.pauloalmeidaf.financemicroservice.receivable.persistance;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceivableSpringDataDao extends CrudRepository<Receivable, Long> {

    @Query("SELECT r FROM Receivable r where r.personId = ?1")
    List<Receivable> findByPersonId(Long personId, Sort sort);
}
