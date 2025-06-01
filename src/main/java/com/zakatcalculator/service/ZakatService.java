package com.example.zakatcalculator.service;

import com.example.zakatcalculator.model.Asset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZakatService {
    private static final double ZAKAT_PERCENTAGE = 2.5;

    public double calculateZakat(List<Asset> assets) {
        double totalAssets = assets.stream().mapToDouble(Asset::getValue).sum();
        return (totalAssets * ZAKAT_PERCENTAGE) / 100.0;
    }
}