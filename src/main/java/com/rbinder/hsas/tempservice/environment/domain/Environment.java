package com.rbinder.hsas.tempservice.environment.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	/**
	 * Constructor
	 */
	public Environment() {
	}

	/**
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public Environment(final double temperature, final double pressure, final double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
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

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(temperature).append(pressure).append(humidity).toHashCode();
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
				.append(pressure, rhs.pressure).append(humidity, rhs.humidity).isEquals();
	}

	@Override
	public String toString() {
		return String.format("Environment [temperature=%s, pressure=%s, humidity=%s]", temperature, pressure, humidity);
	}

}