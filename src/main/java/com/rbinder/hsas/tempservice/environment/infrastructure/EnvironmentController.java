/**
 *
 */
package com.rbinder.hsas.tempservice.environment.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbinder.hsas.tempservice.environment.application.EnvironmentService;
import com.rbinder.hsas.tempservice.environment.application.EnvironmentServiceException;
import com.rbinder.hsas.tempservice.environment.domain.Environment;

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
	public Environment getEnvironment() throws EnvironmentServiceException {
		return environmentService.getEnvironment();
	}
}
