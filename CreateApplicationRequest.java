import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateApplicationRequest {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotNull(message = "Age cannot be null")
    private Integer age;

    // Constructor
    public CreateApplicationRequest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}