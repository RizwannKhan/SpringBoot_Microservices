package com.rizwan.fraud.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_id_seq", sequenceName = "fraud_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_seq")
    private Long id;
    private Long customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
