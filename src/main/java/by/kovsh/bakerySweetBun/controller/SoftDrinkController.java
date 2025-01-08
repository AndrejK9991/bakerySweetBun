package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.PieService;
import by.kovsh.bakerySweetBun.service.SoftDrinkService;
import by.kovsh.bakerySweetBun.service.dto.PieDto;
import by.kovsh.bakerySweetBun.service.dto.SoftDrinkDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/softDrink")
public class SoftDrinkController {

    private final SoftDrinkService softDrinkService;

    public SoftDrinkController(SoftDrinkService softDrinkService) {
        this.softDrinkService = softDrinkService;
    }

    @PostMapping
    void postSoftDrink(@RequestBody List<SoftDrinkDto> softDrinkDtos) {
        softDrinkService.createSoftDrinks(softDrinkDtos);

    }

    @GetMapping
    List<SoftDrinkDto> getAllSoftDrinks() {

        return softDrinkService.getAllSoftDrinks();
    }

    @PutMapping
    void updateSoftDrink(@RequestBody SoftDrinkDto softDrinkDto) {

        softDrinkService.updateSoftDrink(softDrinkDto);
    }

    @DeleteMapping
    void deleteSoftDrinks(@RequestBody List<Long> ids) {

        softDrinkService.deleteAllSoftDrinksByIds(ids);
    }
}
