package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.PieService;
import by.kovsh.bakerySweetBun.service.dto.PieDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pies")
public class PieController {

    private final PieService pieService;

    public PieController(PieService pieService) {
        this.pieService = pieService;
    }

    @PostMapping
    void postPie(@RequestBody List<PieDto> pieDtos) {
        pieService.createPies(pieDtos);

    }

    @GetMapping
    List<PieDto> getAllPies() {

        return pieService.getAllPies();
    }

    @PutMapping
    void updatePie(@RequestBody PieDto pieDto) {

        pieService.updatePie(pieDto);
    }

    @DeleteMapping
    void deletePies(@RequestBody List<Long> ids) {

        pieService.deleteAllPiesByIds(ids);
    }

}
