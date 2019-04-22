/**
 *
 */
package com.rbinder.hsas.tempservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbinder.hsas.tempservice.model.Environment;
import com.rbinder.hsas.tempservice.service.EnvironmentService;

/**
 * @author Robin
 *
 */
@RestController
public class EnvironmentController {

	private final EnvironmentService environmentService;

	/**
	 * @param environmentService
	 */
	public EnvironmentController(final EnvironmentService environmentService) {
		this.environmentService = environmentService;
	}

	@GetMapping(value = "/environments")
	public Environment getEnvironment() {
		return environmentService.getEnvironment();
	}
}
