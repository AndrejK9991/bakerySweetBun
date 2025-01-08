package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.CroissantService;
import by.kovsh.bakerySweetBun.service.dto.CroissantDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/croissants")
public class CroissantController {

    private final CroissantService croissantService;

    public CroissantController(CroissantService croissantService) {
        this.croissantService = croissantService;
    }

    @PostMapping
    void postCroissant(@RequestBody List<CroissantDto> croissantDtos) {
        croissantService.createCroissants(croissantDtos);

    }

    @GetMapping
    List<CroissantDto> getAllCroissants() {

        return croissantService.getAllCroissants();
    }

    @PutMapping
    void updateCroissant(@RequestBody CroissantDto croissantDto) {

        croissantService.updateCroissant(croissantDto);
    }

    @DeleteMapping
    void deleteCroissants(@RequestBody List<Long> ids) {

        croissantService.deleteAllCroissantsByIds(ids);
    }

}
