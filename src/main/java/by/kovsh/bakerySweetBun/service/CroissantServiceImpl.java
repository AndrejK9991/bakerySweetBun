package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Croissant;
import by.kovsh.bakerySweetBun.repo.CroissantRepository;
import by.kovsh.bakerySweetBun.service.dto.CroissantDto;
import by.kovsh.bakerySweetBun.service.mapper.CroissantMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CroissantServiceImpl implements CroissantService {

    private final CroissantRepository croissantRepository;

    private final CroissantMapper croissantMapper;

    public CroissantServiceImpl(CroissantRepository croissantRepository, CroissantMapper croissantMapper) {
        this.croissantRepository = croissantRepository;
        this.croissantMapper = croissantMapper;
    }

    @Override
    public void createCroissants(List<CroissantDto> croissantDtos) {
        List<Croissant> croissants = croissantMapper.croissantDtosToCroissants(croissantDtos);
        croissantRepository.saveAll(croissants);
    }

    @Override
    public List<CroissantDto> getAllCroissants() {
        List<CroissantDto> croissantDtos = new ArrayList<>();
        List<Croissant> croissants = new ArrayList<>();
        croissants = croissantRepository.findAll();
        croissantDtos = croissantMapper.croissantsToCroissantDtos(croissants);
        return croissantDtos;
    }

    @Override
    public void updateCroissant(CroissantDto croissantDto) {
        List<CroissantDto> croissantDtos = new ArrayList<>();
        List<Croissant> croissants = new ArrayList<>();
        croissantDtos.add(croissantDto);
        croissants = croissantMapper.croissantDtosToCroissants(croissantDtos);
        croissantRepository.saveAllAndFlush(croissants);
    }

    @Override
    public void deleteAllCroissantsByIds(List<Long> ids) {
        croissantRepository.deleteAllById(ids);
    }

}
