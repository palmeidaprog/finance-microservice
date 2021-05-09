package com.pauloalmeidaf.financemicroservice.receivable.business;

import com.pauloalmeidaf.financemicroservice.receivable.persistance.Receivable;
import com.pauloalmeidaf.financemicroservice.receivable.persistance.ReceivableSpringDataDao;
import com.pauloalmeidaf.financemicroservice.receivable.rest.ReceivableDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component @Slf4j
public class ReceivableBusiness {

    private ReceivableSpringDataDao dao;

    @Autowired
    public ReceivableBusiness(ReceivableSpringDataDao dao) {
        this.dao = dao;
    }

    public List<ReceivableDto> getListById(Long personId) {
        final String logObject = "Receivable list with personId " + personId;

        try {
            log.info("getListById :: Querying for a {}", logObject);
            final List<Receivable> receivables = this.dao.findByPersonId(personId, Sort.by("date"));
            return receivables.stream().map(ReceivableDto::new).collect(Collectors.toList());

        } catch (Exception e) {
            log.error("getListById :: Error while querying a {}. Reason: {}", logObject, e.getMessage(), e);
        }

        return Collections.emptyList();
    }
}
