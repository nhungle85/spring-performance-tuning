package com.nle.spring.performance.monitor.demoperformanceapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nle.spring.performance.monitor.demoperformanceapi.domain.Device;
import com.nle.spring.performance.monitor.demoperformanceapi.repository.DeviceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeviceService {
	private DeviceRepository deviceRepository;
	
	public List<Device> getAllDevices() {
		return deviceRepository.findAll();
	}
}
