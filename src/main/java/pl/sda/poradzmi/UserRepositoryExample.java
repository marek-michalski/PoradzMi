package pl.sda.poradzmi;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserRepositoryExample {
    private UserRepository userRepository; //komponent ponizej wstrzykuje z wykorzystaniem konstruktora

    public UserRepositoryExample(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void example() {
        userRepository.save(new User("mmichalski","mmichalski","Marek","Michalski","marek.michalski@me.com"));
    }
}
