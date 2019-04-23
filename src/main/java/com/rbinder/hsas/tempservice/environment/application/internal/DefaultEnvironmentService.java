package com.rbinder.hsas.tempservice.environment.application.internal;

import static com.rbinder.hsas.tempservice.Profiles.DEFAULT;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rbinder.hsas.tempservice.environment.application.EnvironmentService;
import com.rbinder.hsas.tempservice.environment.application.EnvironmentServiceException;
import com.rbinder.hsas.tempservice.environment.domain.Environment;

/**
 * Default implementation for {@link EnvironmentService}. Reads the current
 * values form a file.
 *
 * @author Robin
 *
 */
@Profile(DEFAULT)
@Service
class DefaultEnvironmentService implements EnvironmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultEnvironmentService.class);

	@Value("${environemt.json.file}")
	private String environemtJsonFile;

	@Override
	public Environment getEnvironment() throws EnvironmentServiceException {
		final ObjectMapper jsonMapper = new ObjectMapper();
		try {
			return jsonMapper.readValue(new File(environemtJsonFile), Environment.class);
		} catch (final IOException e) {
			final String msg = "Can't read json file " + environemtJsonFile;
			LOGGER.error(msg);
			throw new EnvironmentServiceException(msg, e);
		}
	}

}
