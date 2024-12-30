package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Cake;
import by.kovsh.bakerySweetBun.service.dto.CakeDto;

import java.util.List;

public interface CakeService {

    void createCakes(List<CakeDto> cakeDtos);

    List<CakeDto> getAllCakes();

    void updateCake(CakeDto cakeDto);

    void deleteAllCakesByIds(List<Long> ids);


}
