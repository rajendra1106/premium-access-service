package com.example.premium_access_service.dto;
import com.example.premium_access_service.domain.Environment;
import com.example.premium_access_service.domain.UserLevel;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class PremiumAccessRequest {

    @NotNull
    private Environment environment;
    @NotNull
    private UserLevel userLevel;
}
