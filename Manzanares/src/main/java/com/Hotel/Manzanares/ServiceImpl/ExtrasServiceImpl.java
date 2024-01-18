package com.Hotel.Manzanares.ServiceImpl;

import com.Hotel.Manzanares.Entity.Extras;
import com.Hotel.Manzanares.Repository.ExtrasRepository;
import com.Hotel.Manzanares.Service.ExtrasService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ExtrasServiceImpl implements ExtrasService {

    private final ExtrasRepository extrasRepository;
    @Override
    public Optional<Extras> getExtras(Long id) {
        return extrasRepository.findById(id);
    }

    @Override
    public void createExtras(Extras extras) {
        try{
            extrasRepository.save(extras);
        }catch (Exception e){
            System.out.println("Error al grabar el extra: "+e.getMessage());
        }
    }

    @Override
    @Transactional
    public void deleteExtras(String descripcion) {
        try{
            extrasRepository.deleteByDescripcion(descripcion);
        }catch (Exception e){
            System.out.println("Error al eliminar el extra: "+e.getMessage());
        }
    }

    @Override
    public void updateExtras(String descripcion, Extras extra) {
        try{
            Extras elemento= extrasRepository.findByDescripcion(descripcion);
            if(elemento!=null){
                elemento.setDescripcion(extra.getDescripcion());
                elemento.setPrecio(extra.getPrecio());

                extrasRepository.save(elemento);
            }

        }catch (Exception e){
            System.out.println("Error al modificar el extra: "+e.getMessage());
        }

    }
}
