package com.rbinder.hsas.tempservice.service;

import static com.rbinder.hsas.tempservice.Profiles.DEFAULT;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rbinder.hsas.tempservice.model.Environment;

/**
 * Default implementation for {@link EnvironmentService}. Reads the current
 * values form a file.
 *
 * @author Robin
 *
 */
@Profile(DEFAULT)
@Service
public class DefaultEnvironmentService implements EnvironmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultEnvironmentService.class);

	@Value("${environemt.json.file}")
	private String environemtJsonFile;

	@Override
	public Environment getEnvironment() {
		final ObjectMapper jsonMapper = new ObjectMapper();
		try {
			return jsonMapper.readValue(new File(environemtJsonFile), Environment.class);
		} catch (final IOException e) {
			LOGGER.error("Can't read json file {}", environemtJsonFile, e);
			return null;
		}
	}

}
