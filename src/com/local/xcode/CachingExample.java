package com.local.xcode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

class CacheService {
    private final Map<String, String> cache = new HashMap<>();

    // Method to get value from cache or generate it if absent
    public String getValue(String key, Supplier<String> valueSupplier, Consumer<String> cacheUpdater) {
        return cache.computeIfAbsent(key, k -> {
            String value = valueSupplier.get(); // Generate value
            cacheUpdater.accept(value); // Update cache
            return value; // Return the value
        });
    }
}

public class CachingExample {
    public static void main(String[] args) {
        CacheService cacheService = new CacheService();

        // Supplier to generate a value dynamically
        Supplier<String> valueSupplier = () -> "Generated Value";

        // Consumer to print the cached value
        Consumer<String> cacheUpdater = value -> System.out.println("Caching value: " + value+1);

        // Fetching value using cache
        String cachedValue = cacheService.getValue("key1", valueSupplier, cacheUpdater);
        System.out.println("Value: " + cachedValue); // Output: Value: Generated Value
    }
}
