package com.fastcampus.loan.controller;


import com.fastcampus.loan.dto.CounselDTO;
import com.fastcampus.loan.dto.ResponseDTO;
import com.fastcampus.loan.service.CounselService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/counsels")
public class CounselController extends AbstractController{

    private final CounselService counselService;

    @PostMapping
    public ResponseDTO<CounselDTO.Response> create(@RequestBody CounselDTO.Request request)
    {
        return ok(counselService.create(request));
    }


    @GetMapping("/{counselId}")
    public ResponseDTO<CounselDTO.Response> get(@PathVariable Long counselId)
    {
        return ok(counselService.get(counselId));
    }


}
