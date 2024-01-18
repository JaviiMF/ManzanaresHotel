package com.Hotel.Manzanares.ServiceImpl;

import com.Hotel.Manzanares.Entity.Gama;
import com.Hotel.Manzanares.Repository.GamaRepository;
import com.Hotel.Manzanares.Service.GamaService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GamaServiceImpl implements GamaService {

    private final GamaRepository gamaRepository;
    @Override
    public Optional<Gama> getGama(Long id) {
        return gamaRepository.findById(id);
    }

    @Override
    public void createGama(Gama gama) {
        try{
            gamaRepository.save(gama);
        }catch (Exception e){
            System.out.println("Error al grabar la gama" + e.getMessage());
        }
    }

    @Override
    @Transactional
    public void deleteGama(String nombre) {
        try{
            gamaRepository.deleteGamaByNombre(nombre);
        }catch (Exception e){
            System.out.println("Error al grabar la gama" + e.getMessage());
        }
    }

    @Override
    public void updateGama(String nombre, Gama gama) {
        try{
            Gama elemento = gamaRepository.findByNombre(nombre);
            if(elemento!=null){
                elemento.setNombre(gama.getNombre());
                elemento.setDescripcion(gama.getDescripcion());
                elemento.setPrecio(gama.getPrecio());

                gamaRepository.save(elemento);
            }
        }catch (Exception e){
            System.out.println("Error al modificar gama" + e.getMessage());
        }

    }
}
