package com.tneciv.dockerboot.common;

public class ApplicationException extends RuntimeException {

    private static final long serialVersionUID = -4763297211295974221L;

    public ApplicationException() {
        super();
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }
}
