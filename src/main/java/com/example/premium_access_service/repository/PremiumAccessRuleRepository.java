package com.example.premium_access_service.repository;
import com.example.premium_access_service.domain.PremiumAccessRule;
import com.example.premium_access_service.domain.UserLevel;
import com.example.premium_access_service.domain.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface PremiumAccessRuleRepository extends JpaRepository<PremiumAccessRule, Long> {

    Optional <PremiumAccessRule> findByTenantIdAndEnvironmentAndUserLevel(String tenantId, Environment environment, UserLevel userLevel);

};
