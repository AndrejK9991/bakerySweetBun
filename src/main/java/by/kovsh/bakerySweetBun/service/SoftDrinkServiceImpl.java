package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.SoftDrink;
import by.kovsh.bakerySweetBun.repo.SoftDrinkRepository;
import by.kovsh.bakerySweetBun.service.dto.SoftDrinkDto;
import by.kovsh.bakerySweetBun.service.mapper.SoftDrinkMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class SoftDrinkServiceImpl implements SoftDrinkService{

    private final SoftDrinkRepository softDrinkRepository;

    private final SoftDrinkMapper softDrinkMapper;

    public SoftDrinkServiceImpl(SoftDrinkRepository softDrinkRepository, SoftDrinkMapper softDrinkMapper) {
        this.softDrinkRepository = softDrinkRepository;
        this.softDrinkMapper = softDrinkMapper;
    }

    @Override
    public void createSoftDrinks(List<SoftDrinkDto> softDrinkDtos) {
        List<SoftDrink> softDrinks = softDrinkMapper.softDrinkDtosToSoftDrinks(softDrinkDtos);
        softDrinkRepository.saveAll(softDrinks);
    }

    @Override
    public List<SoftDrinkDto> getAllSoftDrinks() {
        List<SoftDrinkDto> softDrinkDtos = new ArrayList<>();
        List<SoftDrink> softDrinks = new ArrayList<>();
        softDrinks = softDrinkRepository.findAll();
        softDrinkDtos = softDrinkMapper.softDrinksToSoftDrinkDtos(softDrinks);
        return softDrinkDtos;
    }

    @Override
    public void updateSoftDrink(SoftDrinkDto softDrinkDto) {
        List<SoftDrinkDto> softDrinkDtos = new ArrayList<>();
        List<SoftDrink> softDrinks = new ArrayList<>();
        softDrinkDtos.add(softDrinkDto);
        softDrinks = softDrinkMapper.softDrinkDtosToSoftDrinks(softDrinkDtos);
        softDrinkRepository.saveAllAndFlush(softDrinks);
    }

    @Override
    public void deleteAllSoftDrinksByIds(List<Long> ids) {
        softDrinkRepository.deleteAllById(ids);
    }

}
