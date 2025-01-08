package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.CookieService;
import by.kovsh.bakerySweetBun.service.dto.CookieDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cookies")
public class CookieController {

    private final CookieService cookieService;

    public CookieController(CookieService cookieService) {
        this.cookieService = cookieService;
    }

    @PostMapping
    void postCookie(@RequestBody List<CookieDto> cookieDtos) {
        cookieService.createCookies(cookieDtos);

    }

    @GetMapping
    List<CookieDto> getAllCookies() {

        return cookieService.getAllCookies();
    }

    @PutMapping
    void updateCookie(@RequestBody CookieDto cookieDto) {

        cookieService.updateCookie(cookieDto);
    }

    @DeleteMapping
    void deleteCookies(@RequestBody List<Long> ids) {

        cookieService.deleteAllCookiesByIds(ids);
    }

}
