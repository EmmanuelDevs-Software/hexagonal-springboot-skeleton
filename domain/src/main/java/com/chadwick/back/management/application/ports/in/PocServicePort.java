package com.chadwick.back.management.application.ports.in;

import com.chadwick.back.management.application.domain.Poc;

public interface PocServicePort {
    Poc createPoc(Poc poc);
}
