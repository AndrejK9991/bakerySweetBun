package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.PieDto;

import java.util.List;

public interface PieService {

    void createPies(List<PieDto> pieDtos);

    List<PieDto> getAllPies();

    void updatePie(PieDto pieDto);

    void deleteAllPiesByIds(List<Long> ids);

}
