package com.chadwick.back.management.repositories.adapters;

import com.chadwick.back.management.application.domain.Poc;
import com.chadwick.back.management.application.ports.out.PocRepositoryPort;
import com.chadwick.back.management.repositories.PocMOJpaRepository;
import com.chadwick.back.management.repositories.mappers.PocMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
public class PocRepositoryAdapter implements PocRepositoryPort {

    private final PocMOJpaRepository pocMOJpaRepository;
    private final PocMapper pocMapper;

    @Override
    public Poc createPoc(Poc poc) {
        System.out.println(poc);
        var pocMO = pocMapper.toModel(poc);
        var pocMOJ = pocMOJpaRepository.save(pocMO);
        var result = pocMapper.fromModel(pocMOJ);
        return result;
    }
}
