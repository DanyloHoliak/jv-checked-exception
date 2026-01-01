package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator;

    public void registerUser(User user) throws PasswordValidationException {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
