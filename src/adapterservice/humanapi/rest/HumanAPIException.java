package adapterservice.humanapi.rest;

/**
 * Exception class for HumanAPI
 */
public class HumanAPIException extends Exception {

	private static final long serialVersionUID = -871626446065916452L;

	public HumanAPIException() {
        super();
    }

    public HumanAPIException(String message) {
        super(message);
    }

    public HumanAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public HumanAPIException(Throwable cause) {
        super(cause);
    }
}
