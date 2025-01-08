package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.entity.Cookie;
import by.kovsh.bakerySweetBun.repo.CookieRepository;
import by.kovsh.bakerySweetBun.service.dto.CookieDto;
import by.kovsh.bakerySweetBun.service.mapper.CookieMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CookieServiceImpl implements CookieService {

    private final CookieRepository cookieRepository;

    private final CookieMapper cookieMapper;

    public CookieServiceImpl(CookieRepository cookieRepository, CookieMapper cookieMapper) {
        this.cookieRepository = cookieRepository;
        this.cookieMapper = cookieMapper;
    }

    @Override
    public void createCookies(List<CookieDto> cookieDtos) {
        List<Cookie> cookies = cookieMapper.cookieDtosToCookies(cookieDtos);
        cookieRepository.saveAll(cookies);
    }

    @Override
    public List<CookieDto> getAllCookies() {
        List<CookieDto> cookieDtos = new ArrayList<>();
        List<Cookie> cookies = new ArrayList<>();
        cookies = cookieRepository.findAll();
        cookieDtos = cookieMapper.cookiesToCookieDtos(cookies);
        return cookieDtos;
    }

    @Override
    public void updateCookie(CookieDto cookieDto) {
        List<CookieDto> cookieDtos = new ArrayList<>();
        List<Cookie> cookies = new ArrayList<>();
        cookieDtos.add(cookieDto);
        cookies = cookieMapper.cookieDtosToCookies(cookieDtos);
        cookieRepository.saveAllAndFlush(cookies);
    }

    @Override
    public void deleteAllCookiesByIds(List<Long> ids) {
        cookieRepository.deleteAllById(ids);
    }

}
