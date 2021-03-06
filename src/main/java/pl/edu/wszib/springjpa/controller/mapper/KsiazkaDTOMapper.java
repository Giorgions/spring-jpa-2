package pl.edu.wszib.springjpa.controller.mapper;

import org.mapstruct.Mapper;
import pl.edu.wszib.springjpa.controller.dto.KsiazkaDTO;
import pl.edu.wszib.springjpa.service.model.DomainKsiazka;

import java.util.List;

@Mapper
public interface KsiazkaDTOMapper {

    KsiazkaDTO map(DomainKsiazka ksiazka);
    DomainKsiazka map(KsiazkaDTO ksiazkaDTO);
    List<KsiazkaDTO> mapToDTO(List<DomainKsiazka> domainKsiazkas);
}
