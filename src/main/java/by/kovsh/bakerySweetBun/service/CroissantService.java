package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.CroissantDto;

import java.util.List;

public interface CroissantService {

    void createCroissants(List<CroissantDto> croissantDtos);

    List<CroissantDto> getAllCroissants();

    void updateCroissant(CroissantDto croissantDto);

    void deleteAllCroissantsByIds(List<Long> ids);

}
