package com.rbinder.hsas.tempservice.service;

import com.rbinder.hsas.tempservice.model.Environment;

/**
 * Reads the current environment values.
 *
 * @author Robin
 *
 */
public interface EnvironmentService {

	/**
	 * @return the current Environment
	 */
	Environment getEnvironment();
}
