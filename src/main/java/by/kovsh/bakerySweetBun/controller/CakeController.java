package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.CakeService;
import by.kovsh.bakerySweetBun.service.dto.CakeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cakes")
public class CakeController {

    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @PostMapping
    void postCake(@RequestBody List<CakeDto> cakeDtos) {
        cakeService.createCakes(cakeDtos);

    }

    @GetMapping
    List<CakeDto> getAllCakes() {
        return cakeService.getAllCakes();
    }


}
