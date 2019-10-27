/**
 * @ClassName NameExistException
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/27  20:17
 * @Veresion 1.0
 */
class NameIsNotExist extends Exception{
    public NameIsNotExist() {
        super();
    }

    public NameIsNotExist(String message) {
        super(message);
    }

    public NameIsNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public NameIsNotExist(Throwable cause) {
        super(cause);
    }

    protected NameIsNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
public class NameExistException extends Exception {
    public NameExistException() {
        super();
    }

    public NameExistException(String message) {
        super(message);
    }

    public NameExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameExistException(Throwable cause) {
        super(cause);
    }

    protected NameExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
