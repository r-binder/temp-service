package com.rbinder.hsas.tempservice.environment.application;

/**
 * @author robin
 *
 */
public class EnvironmentServiceException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -7261468198554240594L;

	/**
	 *
	 */
	public EnvironmentServiceException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EnvironmentServiceException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EnvironmentServiceException(final String message, final Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public EnvironmentServiceException(final String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public EnvironmentServiceException(final Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
