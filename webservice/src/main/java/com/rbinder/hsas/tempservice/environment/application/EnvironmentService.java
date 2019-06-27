package com.rbinder.hsas.tempservice.environment.application;

import com.rbinder.hsas.tempservice.environment.domain.Environment;

/**
 * Reads the current environment values.
 *
 * @author Robin
 *
 */
public interface EnvironmentService {

	/**
	 * @return the current Environment
	 * @throws EnvironmentServiceException
	 */
	Environment getEnvironment() throws EnvironmentServiceException;
}
