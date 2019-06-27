package com.rbinder.hsas.tempservice.environment.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.DateTime;

/**
 * Environment model.
 *
 * @author Robin
 *
 */
public class Environment {
	private double temperature;
	private double pressure;
	private double humidity;
	private DateTime timestamp;

	/**
	 * Constructor
	 */
	public Environment() {
	}

	/**
	 * Constructor. Timestamp is set to current time.
	 *
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public Environment(final double temperature, final double pressure, final double humidity) {
		this(temperature, pressure, humidity, new DateTime());
	}

	/**
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 * @param timestamp
	 */
	public Environment(final double temperature, final double pressure, final double humidity,
			final DateTime timestamp) {
		super();
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(final double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the pressure
	 */
	public double getPressure() {
		return pressure;
	}

	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(final double pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(final double humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the timestamp
	 */
	public DateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(final DateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(temperature).append(pressure).append(humidity).append(timestamp)
				.toHashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		final Environment rhs = (Environment) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).append(temperature, rhs.temperature)
				.append(pressure, rhs.pressure).append(humidity, rhs.humidity).append(timestamp, rhs.timestamp)
				.isEquals();
	}

	@Override
	public String toString() {
		return String.format("Environment [temperature=%s, pressure=%s, humidity=%s, timestamp=%s]", temperature,
				pressure, humidity, timestamp);
	}

}