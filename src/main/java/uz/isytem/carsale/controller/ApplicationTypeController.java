package uz.isytem.carsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isytem.carsale.dto.ApplicationDto;
import uz.isytem.carsale.dto.ApplicationTypeDto;
import uz.isytem.carsale.service.ApplicationTypeService;

@RestController
@RequestMapping("/application-type")
public class ApplicationTypeController {

    @Autowired
    private ApplicationTypeService applicationTypeService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ApplicationTypeDto dto){
        ApplicationTypeDto result = applicationTypeService.create(dto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable ("id")Integer id){
        ApplicationTypeDto result = applicationTypeService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable ("id")Integer id,@RequestBody ApplicationTypeDto dto){
        Boolean result = applicationTypeService.update(id,dto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id")Integer id){
        Boolean result = applicationTypeService.delete(id);
        return ResponseEntity.ok(result);
    }

}
