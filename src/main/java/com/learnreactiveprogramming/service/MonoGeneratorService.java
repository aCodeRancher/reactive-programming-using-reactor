package com.learnreactiveprogramming.service;

import reactor.core.publisher.Mono;

public class MonoGeneratorService {

    public Mono<String> namesMono_map_filter(int stringlength){
        return  Mono.just("alex")
                .map(String::toUpperCase)
                .filter(s-> s.length() ==stringlength);

    }
}
