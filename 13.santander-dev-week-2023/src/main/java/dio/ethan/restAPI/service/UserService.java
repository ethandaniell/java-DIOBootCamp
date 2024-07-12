package dio.ethan.restAPI.service;

import dio.ethan.restAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
