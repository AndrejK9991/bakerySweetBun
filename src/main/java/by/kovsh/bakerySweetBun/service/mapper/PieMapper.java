package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.Pie;
import by.kovsh.bakerySweetBun.service.dto.PieDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PieMapper {

    public List<PieDto> piesToPieDtos (List<Pie> pies){
        List<PieDto> pieDtos = new ArrayList<>();

        if (pies == null){
            return null;
        }

        for (int i = 0; i < pies.size(); i++){
            PieDto pieDto = new PieDto();
            pieDto.setId(pies.get(i).getId());
            pieDto.setName(pies.get(i).getName());
            pieDto.setMass(pies.get(i).getMass());
            pieDto.setPrice(pies.get(i).getPrice());
            pieDto.setIngredients(pies.get(i).getIngredients());
            pieDtos.add(pieDto);
        }
        return pieDtos;
    }

    public List<Pie> pieDtosToPies (List<PieDto> pieDtos){
        List<Pie> pies = new ArrayList<>();

        if (pieDtos == null){
            return null;
        }

        for (int i = 0; i < pieDtos.size(); i++){
            Pie pie = new Pie();
            pie.setId(pieDtos.get(i).getId());
            pie.setName(pieDtos.get(i).getName());
            pie.setMass(pieDtos.get(i).getMass());
            pie.setPrice(pieDtos.get(i).getPrice());
            pie.setIngredients(pieDtos.get(i).getIngredients());
            pies.add(pie);
        }
        return pies;
    }

}
