/**
 * 
 */
package com.sarya.student.crud.exception;

/**
 * @author Sarang
 *
 */
public class EntityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new EntityException with {@code null} as its
	 * detail message. The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public EntityException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new EntityException with the specified detail
	 * message.
	 * 
	 * @param message
	 *            the detail message. The detail message is saved for later
	 *            retrieval by the {@link #getMessage()} method.
	 */
	public EntityException(final String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new EntityException with the specified cause and a
	 * detail message of {@code (cause==null ? null : cause.toString())} (which
	 * typically contains the class and detail message of {@code cause}). This
	 * constructor is useful for throwables that are little more than wrappers
	 * for other throwables (for example,
	 * {@link java.security.PrivilegedActionException}).
	 *
	 * <p>
	 * The {@link #fillInStackTrace()} method is called to initialize the stack
	 * trace data in the newly created EntityException.
	 *
	 * @param cause
	 *            the cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A {@code null} value is
	 *            permitted, and indicates that the cause is nonexistent or
	 *            unknown.)
	 */
	public EntityException(final Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new EntityException with the specified detail
	 * message and cause.
	 * <p>
	 * Note that the detail message associated with {@code cause} is <i>not</i>
	 * automatically incorporated in this EntityException's detail
	 * message.
	 *
	 * <p>
	 * The {@link #fillInStackTrace()} method is called to initialize the stack
	 * trace data in the newly created EntityException.
	 *
	 * @param message
	 *            the detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method).
	 * @param cause
	 *            the cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A {@code null} value is
	 *            permitted, and indicates that the cause is nonexistent or
	 *            unknown.)
	 */
	public EntityException(final String message, final Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new EntityException with the specified detail
	 * message, cause, {@linkplain #addSuppressed suppression} enabled or
	 * disabled, and writable stack trace enabled or disabled. If suppression is
	 * disabled, {@link #getSuppressed} for this object will return a
	 * zero-length array and calls to {@link #addSuppressed} that would
	 * otherwise append an exception to the suppressed list will have no effect.
	 * If the writable stack trace is false, this constructor will not call
	 * {@link #fillInStackTrace()}, a {@code null} will be written to the
	 * {@code stackTrace} field, and subsequent calls to
	 * {@code fillInStackTrace} and {@link #setStackTrace(StackTraceElement[])}
	 * will not set the stack trace. If the writable stack trace is false,
	 * {@link #getStackTrace} will return a zero length array.
	 *
	 * @param message
	 *            the detail message.
	 * @param cause
	 *            the cause. (A {@code null} value is permitted, and indicates
	 *            that the cause is nonexistent or unknown.)
	 * @param enableSuppression
	 *            whether or not suppression is enabled or disabled
	 * @param writableStackTrace
	 *            whether or not the stack trace should be writable
	 */
	public EntityException(final String message, final Throwable cause,
			final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
