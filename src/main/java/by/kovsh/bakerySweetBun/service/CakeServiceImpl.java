package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Cake;
import by.kovsh.bakerySweetBun.repo.CakeRepository;
import by.kovsh.bakerySweetBun.service.dto.CakeDto;
import by.kovsh.bakerySweetBun.service.mapper.CakeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CakeServiceImpl implements CakeService {

    private final CakeRepository cakeRepository;

    private final CakeMapper cakeMapper;

    public CakeServiceImpl(CakeRepository cakeRepository, CakeMapper cakeMapper) {
        this.cakeRepository = cakeRepository;
        this.cakeMapper = cakeMapper;
    }

    @Override
    public void createCakes(List<CakeDto> cakeDtos) {
        List<Cake> cakes = cakeMapper.cakeDtosToCakes(cakeDtos);
        cakeRepository.saveAll(cakes);
    }

    @Override
    public List<CakeDto> getAllCakes() {
        List<CakeDto> cakeDtos = new ArrayList<>();
        List<Cake> cakes = new ArrayList<>();
        cakes = cakeRepository.findAll();
        cakeDtos = cakeMapper.cakesToCakeDtos(cakes);
        return cakeDtos;
    }

    @Override
    public void updateCake(CakeDto cakeDto) {
        List<CakeDto> cakeDtos = new ArrayList<>();
        List<Cake> cakes = new ArrayList<>();
        cakeDtos.add(cakeDto);
        cakes = cakeMapper.cakeDtosToCakes(cakeDtos);
        cakeRepository.saveAllAndFlush(cakes);
    }

    @Override
    public void deleteAllCakesByIds(List<Long> ids) {
        cakeRepository.deleteAllById(ids);
    }

}
