package Commons.Model;

import java.io.Serializable;

/*
      Codes for different responses
 */
public enum ResponseAction implements Serializable{

    OK(0),
    INTERNAL_ERROR(1),
    MALFORMED_REQUEST(2),
    UNAUTHORIZED(3),
    WRONG_SENDER(4),
    WRONG_RECEIVER(5),
    WRONG_MAIL_CONTENT(6);

    public int code;

    ResponseAction(int code) { this.code=code; }
}
