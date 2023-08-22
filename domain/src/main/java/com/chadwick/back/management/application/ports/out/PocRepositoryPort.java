package com.chadwick.back.management.application.ports.out;

import com.chadwick.back.management.application.domain.Poc;

public interface PocRepositoryPort {

    Poc createPoc(Poc poc);
}
