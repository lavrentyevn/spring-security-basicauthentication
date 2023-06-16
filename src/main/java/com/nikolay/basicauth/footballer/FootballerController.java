package com.nikolay.basicauth.footballer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/footballers")
@AllArgsConstructor
public class FootballerController {
    private final FootballerService footballerService;

    @GetMapping
    public List<Footballer> getFootballers() {
        return footballerService.getFootballers();
    }

    @PostMapping
    public void createFootballer(@RequestBody Footballer footballer) { footballerService.createFootballer(footballer); }

    @PutMapping("/{id}")
    public void updateFootballer(@PathVariable("id") Long id, @RequestBody Footballer footballer) { footballerService.updateFootballer(id, footballer); }

    @DeleteMapping("/{id}")
    public void deleteFootballer(@PathVariable("id") Long id) { footballerService.deleteFootballer(id); }
}
