package com.Hotel.Manzanares.ServiceImpl;

import com.Hotel.Manzanares.Entity.Servicio;
import com.Hotel.Manzanares.Repository.ServicioRepository;
import com.Hotel.Manzanares.Service.ServicioService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicioServiceImpl implements ServicioService {

    private final ServicioRepository servicioRepository;
    @Override
    public Optional<Servicio> getServicio(Long id) {
        return servicioRepository.findById(id);
    }

    @Override
    public void createService(Servicio servicio) {
        try{
            servicioRepository.save(servicio);
        }catch (Exception e){
            System.out.println("Error al grabar el servcio" + e.getMessage());
        }

    }

    @Override
    @Transactional
    public void deleteServicio(String descripcion) {

        try{
            servicioRepository.deleteByDescripcion(descripcion);
        }catch (Exception e){
            System.out.println("Error al eliminar el servcio" + e.getMessage());
        }

    }

    @Override
    public void updateServicio(String descripcion, Servicio servicio) {
        try{
            Servicio elemento = servicioRepository.findServicioByDescripcion(descripcion);
            if(elemento!=null){
                elemento.setDescripcion(servicio.getDescripcion());
                elemento.setPrecio(servicio.getPrecio());
                elemento.setHorario(servicio.getHorario());

                servicioRepository.save(elemento);
            }
        }catch (Exception e){
            System.out.println("Error al modificar el servcio" + e.getMessage());
        }
    }
}
