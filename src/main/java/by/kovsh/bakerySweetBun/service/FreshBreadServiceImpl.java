package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.FreshBread;
import by.kovsh.bakerySweetBun.repo.FreshBreadRepository;
import by.kovsh.bakerySweetBun.service.dto.FreshBreadDto;
import by.kovsh.bakerySweetBun.service.mapper.FreshBreadMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FreshBreadServiceImpl implements FreshBreadService {

    private final FreshBreadRepository freshBreadRepository;

    private final FreshBreadMapper freshBreadMapper;

    public FreshBreadServiceImpl(FreshBreadRepository freshBreadRepository, FreshBreadMapper freshBreadMapper) {
        this.freshBreadRepository = freshBreadRepository;
        this.freshBreadMapper = freshBreadMapper;
    }

    @Override
    public void createFreshBreads(List<FreshBreadDto> freshBreadDtos) {
        List<FreshBread> freshBreads = freshBreadMapper.freshBreadDtosToFreshBreads(freshBreadDtos);
        freshBreadRepository.saveAll(freshBreads);
    }

    @Override
    public List<FreshBreadDto> getAllFreshBreads() {
        List<FreshBreadDto> freshBreadDtos = new ArrayList<>();
        List<FreshBread> freshBreads = new ArrayList<>();
        freshBreads = freshBreadRepository.findAll();
        freshBreadDtos = freshBreadMapper.freshBreadsToFreshBreadDtos(freshBreads);
        return freshBreadDtos;
    }

    @Override
    public void updateFreshBread(FreshBreadDto freshBreadDto) {
        List<FreshBreadDto> freshBreadDtos = new ArrayList<>();
        List<FreshBread> freshBreads = new ArrayList<>();
        freshBreadDtos.add(freshBreadDto);
        freshBreads = freshBreadMapper.freshBreadDtosToFreshBreads(freshBreadDtos);
        freshBreadRepository.saveAllAndFlush(freshBreads);
    }

    @Override
    public void deleteAllFreshBreadsByIds(List<Long> ids) {
        freshBreadRepository.deleteAllById(ids);
    }

}
