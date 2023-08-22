package com.chadwick.back.management.controllers.adapters;

import com.chadwick.back.management.application.domain.Poc;
import com.chadwick.back.management.application.ports.in.PocServicePort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/poc")
public class PocControllerAdapter {

    @Autowired
    private PocServicePort pocServicePort;

    @PostMapping
    public ResponseEntity<Poc> createPoc(@RequestBody Poc poc) {
        var pocMOJ = pocServicePort.createPoc(poc);
        return ResponseEntity.ok(pocMOJ);
    }
}
