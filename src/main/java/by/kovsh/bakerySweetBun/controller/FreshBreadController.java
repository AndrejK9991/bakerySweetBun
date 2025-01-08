package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.FreshBreadService;
import by.kovsh.bakerySweetBun.service.dto.FreshBreadDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/freshBread")
public class FreshBreadController {

    private final FreshBreadService freshBreadService;

    public FreshBreadController(FreshBreadService freshBreadService) {
        this.freshBreadService = freshBreadService;
    }

    @PostMapping
    void postFreshBread(@RequestBody List<FreshBreadDto> freshBreadDtos) {
        freshBreadService.createFreshBreads(freshBreadDtos);

    }

    @GetMapping
    List<FreshBreadDto> getAllFreshBreads() {

        return freshBreadService.getAllFreshBreads();
    }

    @PutMapping
    void updateFreshBread(@RequestBody FreshBreadDto freshBreadDto) {

        freshBreadService.updateFreshBread(freshBreadDto);
    }

    @DeleteMapping
    void deleteFreshBreads(@RequestBody List<Long> ids) {

        freshBreadService.deleteAllFreshBreadsByIds(ids);
    }

}
