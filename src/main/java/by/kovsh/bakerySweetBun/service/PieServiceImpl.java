package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Pie;
import by.kovsh.bakerySweetBun.repo.PieRepository;
import by.kovsh.bakerySweetBun.service.dto.PieDto;
import by.kovsh.bakerySweetBun.service.mapper.PieMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PieServiceImpl implements PieService {

    private final PieRepository pieRepository;

    private final PieMapper pieMapper;

    public PieServiceImpl(PieRepository pieRepository, PieMapper pieMapper) {
        this.pieRepository = pieRepository;
        this.pieMapper = pieMapper;
    }

    @Override
    public void createPies(List<PieDto> pieDtos) {
        List<Pie> pies = pieMapper.pieDtosToPies(pieDtos);
        pieRepository.saveAll(pies);
    }

    @Override
    public List<PieDto> getAllPies() {
        List<PieDto> pieDtos = new ArrayList<>();
        List<Pie> pies = new ArrayList<>();
        pies = pieRepository.findAll();
        pieDtos = pieMapper.piesToPieDtos(pies);
        return pieDtos;
    }

    @Override
    public void updatePie(PieDto pieDto) {
        List<PieDto> pieDtos = new ArrayList<>();
        List<Pie> pies = new ArrayList<>();
        pieDtos.add(pieDto);
        pies = pieMapper.pieDtosToPies(pieDtos);
        pieRepository.saveAllAndFlush(pies);
    }

    @Override
    public void deleteAllPiesByIds(List<Long> ids) {
        pieRepository.deleteAllById(ids);
    }

}
