package by.kovsh.bakerySweetBun.service;

import by.kovsh.bakerySweetBun.service.dto.CookieDto;

import java.util.List;

public interface CookieService {

    void createCookies(List<CookieDto> cookieDtos);

    List<CookieDto> getAllCookies();

    void updateCookie(CookieDto cookieDto);

    void deleteAllCookiesByIds(List<Long> ids);
}
