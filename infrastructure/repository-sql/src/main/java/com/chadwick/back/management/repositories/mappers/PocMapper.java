package com.chadwick.back.management.repositories.mappers;

import com.chadwick.back.management.application.domain.Poc;
import com.chadwick.back.management.repositories.models.PocMO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PocMapper {

    Poc fromModel(PocMO poc);

    PocMO toModel(Poc poc);
}
