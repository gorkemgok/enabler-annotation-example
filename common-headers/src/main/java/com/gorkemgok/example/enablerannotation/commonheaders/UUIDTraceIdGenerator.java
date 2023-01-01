package com.gorkemgok.example.enablerannotation.commonheaders;

import java.util.UUID;

public class UUIDTraceIdGenerator implements TraceIdGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
