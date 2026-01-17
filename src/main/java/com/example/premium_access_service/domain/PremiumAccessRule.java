package com.example.premium_access_service.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;



@Entity
@Table(name= "premium_access_rules")
@Getter
@Setter
@NoArgsConstructor
public class PremiumAccessRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenant_id", nullable = false)
    private String tenantId;

    @Enumerated(EnumType.STRING)
    @Column( nullable = false)
    private Environment environment;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_level",nullable = false)
    private UserLevel userLevel;

    @Column(name="premium_enabled", nullable = false)
    private boolean premiumEnabled;


}
