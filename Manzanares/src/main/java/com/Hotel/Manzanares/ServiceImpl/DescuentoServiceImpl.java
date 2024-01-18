package com.Hotel.Manzanares.ServiceImpl;

import com.Hotel.Manzanares.Entity.Descuento;
import com.Hotel.Manzanares.Repository.DescuentoRepository;
import com.Hotel.Manzanares.Service.DescuentoService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DescuentoServiceImpl implements DescuentoService {

    private final DescuentoRepository descuentoRepository;
    @Override
    public Optional<Descuento> getDescuento(Long id) {
        return descuentoRepository.findById(id);
    }

    @Override
    public void createDescuento(Descuento descuento) {
        try{
            descuentoRepository.save(descuento);
        }catch (Exception e){
            System.out.println("Error al grabar el descuento: "+e.getMessage());
        }
    }

    @Override
    @Transactional
    public void deleteDescuento(String descripcion) {
        try{
            descuentoRepository.deleteByDescripcion(descripcion);
        }catch (Exception e){
            System.out.println("Error al eliminar el descuento: "+e.getMessage());
        }
    }

    @Override
    public void updateDescuento(String descripcion, Descuento descuento) {
         Descuento elemeneto = descuentoRepository.findByDescripcion(descripcion);
        try{
            if(elemeneto!=null){

                elemeneto.setDescripcion(descuento.getDescripcion());
                elemeneto.setPorcentaje(descuento.getPorcentaje());

                descuentoRepository.save(elemeneto);
            }
        }catch (Exception e){
            System.out.println("Error al modificar el descuento: "+e.getMessage());
        }
    }
}
