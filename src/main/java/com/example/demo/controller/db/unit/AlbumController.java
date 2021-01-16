package com.example.demo.controller.db;

import com.example.demo.model.request.AlbumRequest;
import com.example.demo.model.response.AlbumResponse;
import com.example.demo.service.db.AlbumService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/db/album")

public class AlbumController {

    private final AlbumService albumService;

    @GetMapping
    public List<AlbumResponse> getAll(){
        return albumService.getAll();
    }

    @GetMapping ("/{id}")
    public AlbumResponse getById (@PathVariable String id){
        return albumService.getById(id);
    }

    @PostMapping
    public AlbumResponse create (@Valid @RequestBody AlbumRequest request){
        return albumService.create(request);
    }

    @PutMapping ("/{id}")
    public AlbumResponse update (@RequestBody AlbumRequest request, @PathVariable String id){
        return albumService.update(request, id);
    }

    @DeleteMapping ("/{id}")
    public void delete (@PathVariable String id){
        albumService.delete(id);
    }
}
