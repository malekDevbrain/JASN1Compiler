package org.jasn1.compiler;

public class CompileException extends RuntimeException {

    private static final long serialVersionUID = 6164836597802536594L;

    public CompileException() {
        super();
    }

    public CompileException(String s) {
        super(s);
    }

    public CompileException(Throwable cause) {
        super(cause);
    }

    public CompileException(String s, Throwable cause) {
        super(s, cause);
    }

}