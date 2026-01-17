package com.example.premium_access_service.service;
import com.example.premium_access_service.domain.Environment;
import com.example.premium_access_service.domain.PremiumAccessRule;
import com.example.premium_access_service.domain.UserLevel;
import com.example.premium_access_service.repository.PremiumAccessRuleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PremiumAccessService {

    private final PremiumAccessRuleRepository repository;

    public PremiumAccessService(PremiumAccessRuleRepository repository) {
        this.repository = repository;
    }

    public boolean canAccessPremium(
            String tenantId,
            Environment environment,
            UserLevel userLevel
    ) {

        Optional<PremiumAccessRule> rule =
                repository.findByTenantIdAndEnvironmentAndUserLevel(
                        tenantId,
                        environment,
                        userLevel
                );

        return repository
                .findByTenantIdAndEnvironmentAndUserLevel(
                        tenantId,
                        environment,
                        userLevel
                )
                .map(PremiumAccessRule::isPremiumEnabled)
                .orElse(false);


    }
}




