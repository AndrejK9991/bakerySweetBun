package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.SoftDrinkDto;

import java.util.List;

public interface SoftDrinkService {

    void createSoftDrinks(List<SoftDrinkDto> softDrinkDtos);

    List<SoftDrinkDto> getAllSoftDrinks();

    void updateSoftDrink(SoftDrinkDto softDrinkDto);

    void deleteAllSoftDrinksByIds(List<Long> ids);

}
