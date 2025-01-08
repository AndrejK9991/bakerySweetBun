package by.kovsh.bakerySweetBun.controller;

import by.kovsh.bakerySweetBun.service.MuffinService;
import by.kovsh.bakerySweetBun.service.dto.MuffinDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muffins")
public class MuffinController {

    private final MuffinService muffinService;

    public MuffinController(MuffinService muffinService) {
        this.muffinService = muffinService;
    }

    @PostMapping
    void postMuffin(@RequestBody List<MuffinDto> muffinDtos) {
        muffinService.createMuffins(muffinDtos);

    }

    @GetMapping
    List<MuffinDto> getAllMuffins() {

        return muffinService.getAllMuffins();
    }

    @PutMapping
    void updateMuffin(@RequestBody MuffinDto muffinDto) {

        muffinService.updateMuffin(muffinDto);
    }

    @DeleteMapping
    void deleteMuffins(@RequestBody List<Long> ids) {

        muffinService.deleteAllMuffinsByIds(ids);
    }

}
