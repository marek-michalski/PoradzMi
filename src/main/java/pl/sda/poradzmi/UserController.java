package pl.sda.poradzmi;

import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    //wstrzykniecie beana z wykorzystaniem konstruktora
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Iterable<User> get() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return userRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @PostMapping
    public User post(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}

