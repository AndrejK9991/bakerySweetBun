package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.MuffinDto;

import java.util.List;

public interface MuffinService {

    void createMuffins(List<MuffinDto> muffinDtos);

    List<MuffinDto> getAllMuffins();

    void updateMuffin(MuffinDto muffinDto);

    void deleteAllMuffinsByIds(List<Long> ids);

}
