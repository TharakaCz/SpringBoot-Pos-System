package lk.tharaka.spring.controller;

import lk.tharaka.spring.dto.ItemDTO;
import lk.tharaka.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody ItemDTO itemDTO){
        return service.save(itemDTO);
    }

    @DeleteMapping(value = "/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("code") int code){
        return service.delete(code);
    }

    @GetMapping(value = "/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDTO getItem(@PathVariable int code){
        return service.getItem(code);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<ItemDTO>getAllItems(){
        return service.getAllItems();
    }
}
