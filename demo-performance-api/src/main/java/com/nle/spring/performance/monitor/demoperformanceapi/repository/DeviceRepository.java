package com.nle.spring.performance.monitor.demoperformanceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nle.spring.performance.monitor.demoperformanceapi.domain.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}
