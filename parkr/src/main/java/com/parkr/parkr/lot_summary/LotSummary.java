package com.parkr.parkr.lot_summary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.parkr.parkr.parking_lot.ParkingLot;
import com.parkr.parkr.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "lot_summary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LotSummary {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id", referencedColumnName = "id")
    private ParkingLot parkingLot;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "start_time")
    private LocalDateTime startTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "fee")
    private int fee;
}
