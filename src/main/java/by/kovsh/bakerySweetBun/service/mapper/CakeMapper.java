package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.Cake;
import by.kovsh.bakerySweetBun.service.dto.CakeDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CakeMapper {

    public List<CakeDto> cakesToCakeDtos (List<Cake> cakes){
        List<CakeDto> cakeDtos = new ArrayList<>();

        if (cakes == null){
            return null;
        }

        for (int i = 0; i < cakes.size(); i++){
            CakeDto cakeDto = new CakeDto();
            cakeDto.setId(cakes.get(i).getId());
            cakeDto.setName(cakes.get(i).getName());
            cakeDto.setMass(cakes.get(i).getMass());
            cakeDto.setPrice(cakes.get(i).getPrice());
            cakeDto.setIngredients(cakes.get(i).getIngredients());
//            cakeDto.setStarSystemId(stars.get(i).getStarSystem().getId());
            cakeDtos.add(cakeDto);
        }
        return cakeDtos;
    }

    public List<Cake> cakeDtosToCakes (List<CakeDto> cakeDtos){
        List<Cake> cakes = new ArrayList<>();

        if (cakeDtos == null){
            return null;
        }

        for (int i = 0; i < cakeDtos.size(); i++){
            Cake cake = new Cake();
//            StarSystem starSystem = new StarSystem();

            cake.setId(cakeDtos.get(i).getId());
            cake.setName(cakeDtos.get(i).getName());
            cake.setMass(cakeDtos.get(i).getMass());
            cake.setPrice(cakeDtos.get(i).getPrice());
            cake.setIngredients(cakeDtos.get(i).getIngredients());
//            starSystem.setId(starDtos.get(i).getStarSystemId());
//            star.setStarSystem(starSystem);
            cakes.add(cake);
        }
        return cakes;
    }



}
