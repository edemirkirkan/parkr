package com.parkr.parkr.parking_lot_pricing;

import com.parkr.parkr.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pricings")
@RequiredArgsConstructor
public class PricingController {
    private final IPricingService pricingService;

    @GetMapping("{id}")
    public ApiResponse getPricingById(@PathVariable Long id) {
        return ApiResponse.ok(pricingService.getPricingById(id));
    }

    @GetMapping
    public ApiResponse getAllPricings() {
        return ApiResponse.ok(pricingService.getAllPricings());
    }

    @PostMapping()
    public ApiResponse savePricing(@RequestBody PricingDto pricingDto) {
        return ApiResponse.ok(pricingService.savePricing(pricingDto, pricingDto.getParkingLotId()));
    }
}
