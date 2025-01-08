package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.Muffin;
import by.kovsh.bakerySweetBun.service.dto.MuffinDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MuffinMapper {

    public List<MuffinDto> muffinsToMuffinDtos (List<Muffin> muffins){
        List<MuffinDto> muffinDtos = new ArrayList<>();

        if (muffins == null){
            return null;
        }

        for (int i = 0; i < muffins.size(); i++){
            MuffinDto muffinDto = new MuffinDto();
            muffinDto.setId(muffins.get(i).getId());
            muffinDto.setName(muffins.get(i).getName());
            muffinDto.setMass(muffins.get(i).getMass());
            muffinDto.setPrice(muffins.get(i).getPrice());
            muffinDto.setIngredients(muffins.get(i).getIngredients());
            muffinDtos.add(muffinDto);
        }
        return muffinDtos;
    }

    public List<Muffin> muffinDtosToMuffins (List<MuffinDto> muffinDtos){
        List<Muffin> muffins = new ArrayList<>();

        if (muffinDtos == null){
            return null;
        }

        for (int i = 0; i < muffinDtos.size(); i++){
            Muffin muffin = new Muffin();
            muffin.setId(muffinDtos.get(i).getId());
            muffin.setName(muffinDtos.get(i).getName());
            muffin.setMass(muffinDtos.get(i).getMass());
            muffin.setPrice(muffinDtos.get(i).getPrice());
            muffin.setIngredients(muffinDtos.get(i).getIngredients());
            muffins.add(muffin);
        }
        return muffins;
    }

}
