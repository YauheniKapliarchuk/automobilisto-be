package com.automobilisto_de.health;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public String getStatus() {
        return "Server automobilisto.de available! \n\nBest Regards!";
    }
}
