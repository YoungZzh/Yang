package school.cjlu.common.mvc.exception;

/**
 * Author:Young
 * Date:2020/12/7-22:01
 * 验证错误统一异常
 */
public class ValidationException extends RuntimeException{

    public ValidationException(){
        super();
    }

    public ValidationException(String message) {
        super(message);
    }
}
