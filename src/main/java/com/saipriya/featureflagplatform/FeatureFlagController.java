package com.saipriya.featureflagplatform;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flags")
public class FeatureFlagController {

    @GetMapping
    public List<Map<String, Object>> listFlags() {
        return List.of(
            Map.of("key", "new-dashboard", "enabled", true),
            Map.of("key", "beta-feature", "enabled", false)
        );
    }

    @GetMapping("/{key}")
    public Map<String, Object> getFlag(@PathVariable String key) {
        return Map.of("key", key, "enabled", false);
    }
}
