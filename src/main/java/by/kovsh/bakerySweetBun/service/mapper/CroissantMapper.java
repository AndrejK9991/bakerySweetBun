package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.Croissant;
import by.kovsh.bakerySweetBun.service.dto.CroissantDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CroissantMapper {

    public List<CroissantDto> croissantsToCroissantDtos (List<Croissant> croissants){
        List<CroissantDto> croissantDtos = new ArrayList<>();

        if (croissants == null){
            return null;
        }

        for (int i = 0; i < croissants.size(); i++){
            CroissantDto croissantDto = new CroissantDto();
            croissantDto.setId(croissants.get(i).getId());
            croissantDto.setName(croissants.get(i).getName());
            croissantDto.setMass(croissants.get(i).getMass());
            croissantDto.setPrice(croissants.get(i).getPrice());
            croissantDto.setIngredients(croissants.get(i).getIngredients());
            croissantDtos.add(croissantDto);
        }
        return croissantDtos;
    }

    public List<Croissant> croissantDtosToCroissants (List<CroissantDto> croissantDtos){
        List<Croissant> croissants = new ArrayList<>();

        if (croissantDtos == null){
            return null;
        }

        for (int i = 0; i < croissantDtos.size(); i++){
            Croissant croissant = new Croissant();
            croissant.setId(croissantDtos.get(i).getId());
            croissant.setName(croissantDtos.get(i).getName());
            croissant.setMass(croissantDtos.get(i).getMass());
            croissant.setPrice(croissantDtos.get(i).getPrice());
            croissant.setIngredients(croissantDtos.get(i).getIngredients());
            croissants.add(croissant);
        }
        return croissants;
    }

}
