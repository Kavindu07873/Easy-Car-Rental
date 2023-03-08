package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.Finalizedto;

import java.util.ArrayList;

public interface FinalizeService {
    public void FinalizeOrder(Finalizedto dto);
    public ArrayList<Finalizedto> getAllFinalizeDetails() ;


}
