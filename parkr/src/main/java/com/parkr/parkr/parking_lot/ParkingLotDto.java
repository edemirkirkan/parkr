package com.parkr.parkr.parking_lot;

import com.parkr.parkr.address.AddressDto;
import com.parkr.parkr.location.LocationDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingLotDto {
    private Long id;

    private String name;

    private String photoUrl;

    private ParkingLotStatus status;

    private int capacity;

    private int occupancy;
}
