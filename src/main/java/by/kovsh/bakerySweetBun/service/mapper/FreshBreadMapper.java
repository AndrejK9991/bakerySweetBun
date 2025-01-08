package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.FreshBread;
import by.kovsh.bakerySweetBun.service.dto.FreshBreadDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FreshBreadMapper {

    public List<FreshBreadDto> freshBreadsToFreshBreadDtos (List<FreshBread> freshBreads){
        List<FreshBreadDto> freshBreadDtos = new ArrayList<>();

        if (freshBreads == null){
            return null;
        }

        for (int i = 0; i < freshBreads.size(); i++){
            FreshBreadDto freshBreadDto = new FreshBreadDto();
            freshBreadDto.setId(freshBreads.get(i).getId());
            freshBreadDto.setName(freshBreads.get(i).getName());
            freshBreadDto.setMass(freshBreads.get(i).getMass());
            freshBreadDto.setPrice(freshBreads.get(i).getPrice());
            freshBreadDto.setIngredients(freshBreads.get(i).getIngredients());
            freshBreadDtos.add(freshBreadDto);
        }
        return freshBreadDtos;
    }

    public List<FreshBread> freshBreadDtosToFreshBreads (List<FreshBreadDto> freshBreadDtos){
        List<FreshBread> freshBreads = new ArrayList<>();

        if (freshBreadDtos == null){
            return null;
        }

        for (int i = 0; i < freshBreadDtos.size(); i++){
            FreshBread freshBread = new FreshBread();
            freshBread.setId(freshBreadDtos.get(i).getId());
            freshBread.setName(freshBreadDtos.get(i).getName());
            freshBread.setMass(freshBreadDtos.get(i).getMass());
            freshBread.setPrice(freshBreadDtos.get(i).getPrice());
            freshBread.setIngredients(freshBreadDtos.get(i).getIngredients());
            freshBreads.add(freshBread);
        }
        return freshBreads;
    }

}
