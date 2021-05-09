package com.pauloalmeidaf.financemicroservice.receivable.rest;

import com.pauloalmeidaf.financemicroservice.receivable.business.ReceivableBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("receivable")
public class ReceivableRestController {

    private ReceivableBusiness receivableBusiness;

    @Autowired
    public ReceivableRestController(ReceivableBusiness receivableBusiness) {
        this.receivableBusiness = receivableBusiness;
    }

//    @RequestMapping(method = RequestMethod.GET, value = "list")
    @GetMapping("list")
    public List<ReceivableDto> getListById(
            @RequestParam(value = "personId", required = false) Long personId) {
        return this.receivableBusiness.getListById(personId);
    }
}


