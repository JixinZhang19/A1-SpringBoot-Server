package skier;

/**
 * @author Rebecca Zhang
 * Created on 2024-06-02
 */
public class SkierOutDto {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public SkierOutDto(String message) {
        this.message = message;
    }

}
