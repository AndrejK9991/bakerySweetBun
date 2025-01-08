package by.kovsh.bakerySweetBun.service.mapper;

import by.kovsh.bakerySweetBun.entity.Cookie;
import by.kovsh.bakerySweetBun.service.dto.CookieDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CookieMapper {

    public List<CookieDto> cookiesToCookieDtos (List<Cookie> cookies){
        List<CookieDto> cookieDtos = new ArrayList<>();

        if (cookies == null){
            return null;
        }

        for (int i = 0; i < cookies.size(); i++){
            CookieDto cookieDto = new CookieDto();
            cookieDto.setId(cookies.get(i).getId());
            cookieDto.setName(cookies.get(i).getName());
            cookieDto.setMass(cookies.get(i).getMass());
            cookieDto.setPrice(cookies.get(i).getPrice());
            cookieDto.setIngredients(cookies.get(i).getIngredients());
            cookieDtos.add(cookieDto);
        }
        return cookieDtos;
    }

    public List<Cookie> cookieDtosToCookies (List<CookieDto> cookieDtos){
        List<Cookie> cookies = new ArrayList<>();

        if (cookieDtos == null){
            return null;
        }

        for (int i = 0; i < cookieDtos.size(); i++){
            Cookie cookie = new Cookie();
            cookie.setId(cookieDtos.get(i).getId());
            cookie.setName(cookieDtos.get(i).getName());
            cookie.setMass(cookieDtos.get(i).getMass());
            cookie.setPrice(cookieDtos.get(i).getPrice());
            cookie.setIngredients(cookieDtos.get(i).getIngredients());
            cookies.add(cookie);
        }
        return cookies;
    }

}
