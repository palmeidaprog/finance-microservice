package com.pauloalmeidaf.financemicroservice.receivable.rest;

import com.pauloalmeidaf.financemicroservice.receivable.business.ReceivableBusiness;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.mockito.Mockito.*;

class ReceivableRestControllerTest {

    @Mock
    ReceivableBusiness receivableBusiness;
    @InjectMocks
    ReceivableRestController receivableRestController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

//    @Test
//    void testGetListById() {
//        when(receivableBusiness.getListById(anyLong())).thenReturn(Arrays.<ReceivableDto>asList(new ReceivableDto(new GregorianCalendar(2021, Calendar.MAY, 1, 8, 18).getTime(), "description", new GregorianCalendar(2021, Calendar.MAY, 1, 8, 18).getTime(), "installment", Integer.valueOf(0), Integer.valueOf(0), new BigDecimal(0), Boolean.TRUE)));
//
//        List<ReceivableDto> result = receivableRestController.getListById(Long.valueOf(1));
//        Assertions.assertEquals(Arrays.<ReceivableDto>asList(new ReceivableDto(new GregorianCalendar(2021, Calendar.MAY, 1, 8, 18).getTime(), "description", new GregorianCalendar(2021, Calendar.MAY, 1, 8, 18).getTime(), "installment", Integer.valueOf(0), Integer.valueOf(0), new BigDecimal(0), Boolean.TRUE)), result);
//    }
}
