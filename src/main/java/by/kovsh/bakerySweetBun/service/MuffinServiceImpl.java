package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Muffin;
import by.kovsh.bakerySweetBun.repo.MuffinRepository;
import by.kovsh.bakerySweetBun.service.dto.MuffinDto;
import by.kovsh.bakerySweetBun.service.mapper.MuffinMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MuffinServiceImpl implements MuffinService {

    private final MuffinRepository muffinRepository;

    private final MuffinMapper muffinMapper;

    public MuffinServiceImpl(MuffinRepository muffinRepository, MuffinMapper muffinMapper) {
        this.muffinRepository = muffinRepository;
        this.muffinMapper = muffinMapper;
    }

    @Override
    public void createMuffins(List<MuffinDto> muffinDtos) {
        List<Muffin> muffins = muffinMapper.muffinDtosToMuffins(muffinDtos);
        muffinRepository.saveAll(muffins);
    }

    @Override
    public List<MuffinDto> getAllMuffins() {
        List<MuffinDto> muffinDtos = new ArrayList<>();
        List<Muffin> muffins = new ArrayList<>();
        muffins = muffinRepository.findAll();
        muffinDtos = muffinMapper.muffinsToMuffinDtos(muffins);
        return muffinDtos;
    }

    @Override
    public void updateMuffin(MuffinDto muffinDto) {
        List<MuffinDto> muffinDtos = new ArrayList<>();
        List<Muffin> muffins = new ArrayList<>();
        muffinDtos.add(muffinDto);
        muffins = muffinMapper.muffinDtosToMuffins(muffinDtos);
        muffinRepository.saveAllAndFlush(muffins);
    }

    @Override
    public void deleteAllMuffinsByIds(List<Long> ids) {
        muffinRepository.deleteAllById(ids);
    }

}
