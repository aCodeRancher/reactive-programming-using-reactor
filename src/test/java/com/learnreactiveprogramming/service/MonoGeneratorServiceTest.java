package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class MonoGeneratorServiceTest {

    MonoGeneratorService monoGeneratorService = new MonoGeneratorService();

   @Test
    public void namesMono_map_filter(){
            Mono<String> nameMono = monoGeneratorService.namesMono_map_filter(4);
            StepVerifier.create(nameMono)
                         .expectNext("ALEX")
                         .verifyComplete();

    }

    @Test
    public void namesMono_map_filter_notFound(){
        Mono<String> nameMono = monoGeneratorService.namesMono_map_filter(5);

        StepVerifier.create(nameMono)
                    .expectNextCount(0)
                    .verifyComplete();

    }
}
