package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.SoftDrink;
import by.kovsh.bakerySweetBun.service.dto.SoftDrinkDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SoftDrinkMapper {

    public List<SoftDrinkDto> softDrinksToSoftDrinkDtos (List<SoftDrink> softDrinks){
        List<SoftDrinkDto> softDrinkDtos = new ArrayList<>();

        if (softDrinks == null){
            return null;
        }

        for (int i = 0; i < softDrinks.size(); i++){
            SoftDrinkDto softDrinkDto = new SoftDrinkDto();
            softDrinkDto.setId(softDrinks.get(i).getId());
            softDrinkDto.setName(softDrinks.get(i).getName());
            softDrinkDto.setMass(softDrinks.get(i).getMass());
            softDrinkDto.setPrice(softDrinks.get(i).getPrice());
            softDrinkDto.setIngredients(softDrinks.get(i).getIngredients());
            softDrinkDtos.add(softDrinkDto);
        }
        return softDrinkDtos;
    }

    public List<SoftDrink> softDrinkDtosToSoftDrinks (List<SoftDrinkDto> softDrinkDtos){
        List<SoftDrink> softDrinks = new ArrayList<>();

        if (softDrinkDtos == null){
            return null;
        }

        for (int i = 0; i < softDrinkDtos.size(); i++){
            SoftDrink softDrink = new SoftDrink();
            softDrink.setId(softDrinkDtos.get(i).getId());
            softDrink.setName(softDrinkDtos.get(i).getName());
            softDrink.setMass(softDrinkDtos.get(i).getMass());
            softDrink.setPrice(softDrinkDtos.get(i).getPrice());
            softDrink.setIngredients(softDrinkDtos.get(i).getIngredients());
            softDrinks.add(softDrink);
        }
        return softDrinks;
    }
}
