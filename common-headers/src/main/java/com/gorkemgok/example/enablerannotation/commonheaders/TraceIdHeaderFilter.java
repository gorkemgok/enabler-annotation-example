package com.gorkemgok.example.enablerannotation.commonheaders;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class TraceIdHeaderFilter extends OncePerRequestFilter {

    private final TraceIdGenerator traceIdGenerator;

    public TraceIdHeaderFilter(TraceIdGenerator traceIdGenerator) {
        this.traceIdGenerator = traceIdGenerator;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.setHeader("X-Trace-Id", traceIdGenerator.generate());
        filterChain.doFilter(request, response);
    }
}
