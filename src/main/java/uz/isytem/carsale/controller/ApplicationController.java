package uz.isytem.carsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isytem.carsale.dto.ApplicationDto;
import uz.isytem.carsale.service.ApplicationService;

import javax.validation.Valid;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid ApplicationDto dto) {
        ApplicationDto result = applicationService.create(dto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        ApplicationDto result = applicationService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody @Valid ApplicationDto dto) {
        boolean result = applicationService.update(id, dto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        boolean result = applicationService.delete(id);
        return ResponseEntity.ok(result);
    }

}
