package com.babbarEnterprises.spring.basics.cdi;

public class SomeCDIBusiness {
    SomeCDIDAO someCDIDAO ;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
