package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.FreshBreadDto;

import java.util.List;

public interface FreshBreadService {

    void createFreshBreads(List<FreshBreadDto> FreshBreadDtos);

    List<FreshBreadDto> getAllFreshBreads();

    void updateFreshBread(FreshBreadDto freshBreadDto);

    void deleteAllFreshBreadsByIds(List<Long> ids);

}
