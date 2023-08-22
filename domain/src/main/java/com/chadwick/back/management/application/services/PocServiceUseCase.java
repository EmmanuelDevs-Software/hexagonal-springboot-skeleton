package com.chadwick.back.management.application.services;

import com.chadwick.back.management.application.domain.Poc;
import com.chadwick.back.management.application.ports.in.PocServicePort;
import com.chadwick.back.management.application.ports.out.PocRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PocServiceUseCase implements PocServicePort {

    private final PocRepositoryPort pocRepositoryPort;

    @Override
    public Poc createPoc(Poc poc) {
        return pocRepositoryPort.createPoc(poc);
    }
}
