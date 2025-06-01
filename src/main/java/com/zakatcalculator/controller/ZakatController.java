package com.example.zakatcalculator.controller;

import com.example.zakatcalculator.model.Asset;
import com.example.zakatcalculator.service.ZakatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/zakat")
public class ZakatController {

    @Autowired
    private ZakatService zakatService;

    @PostMapping("/calculate")
    public Map<String, Double> calculateZakat(@RequestBody List<Asset> assets) {
        double zakat = zakatService.calculateZakat(assets);
        return Map.of("zakat", zakat);
    }
}