package com.Hotel.Manzanares.Service;

import com.Hotel.Manzanares.Request.ReserveRequest;
import org.springframework.stereotype.Service;

@Service
public interface ReserveService {

    String createReserve(ReserveRequest reserveRequest);
}
