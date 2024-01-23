package com.Hotel.Manzanares.ServiceImpl;

import com.Hotel.Manzanares.Entity.Habitacion;
import com.Hotel.Manzanares.Repository.*;
import com.Hotel.Manzanares.Request.ReserveRequest;
import com.Hotel.Manzanares.Service.ReserveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReserveServiceImpl implements ReserveService {

    private final DescuentoRepository descuentoRepository;
    private final ServicioRepository servicioRepository;
    private final ExtrasRepository extrasRepository;
    private final RoomRepository roomRepository;
    private final GamaRepository gamaRepository;

    @Override
    public String createReserve(ReserveRequest reserveRequest) {
        String respuesta = "";

        try{

            String gama = roomRepository.findById(reserveRequest.getIdHabitacion()).get().getGama();



        } catch (Exception e){
            System.out.println("Error creando la reserva" + e.getMessage());
            respuesta = "Error creando la reserva" + e.getMessage();
        }

        return respuesta;
    }
}
