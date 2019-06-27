package com.rbinder.hsas.tempservice.environment.application.internal;

import static com.rbinder.hsas.tempservice.Profiles.MOCK;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rbinder.hsas.tempservice.environment.application.EnvironmentService;
import com.rbinder.hsas.tempservice.environment.domain.Environment;

/**
 * Mock EnvironemtService.
 *
 * @author Robin
 *
 */
@Profile(MOCK)
@Service
class EnvironmentServiceMock implements EnvironmentService {

	private static final int MIN_VALUE = -50;
	private static final int MAX_VALUE = 150;

	@Override
	public Environment getEnvironment() {
		final double temperature = MIN_VALUE + Math.random() * (MAX_VALUE - MIN_VALUE);
		final double pressure = MIN_VALUE + Math.random() * (MAX_VALUE - MIN_VALUE);
		final double humidity = MIN_VALUE + Math.random() * (MAX_VALUE - MIN_VALUE);

		return new Environment(temperature, pressure, humidity);
	}

}
