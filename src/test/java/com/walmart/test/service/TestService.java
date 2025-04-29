package com.walmart.test.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestService {
    public Map<String, Integer>
    countMatches(List<String> arrayA, List<String> arrayB) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String item : arrayB) {
            int count = Collections.frequency(arrayA, item);
            result.put(item, count);
        }
        return result;
    }
}
