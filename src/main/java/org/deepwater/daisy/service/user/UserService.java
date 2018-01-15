package org.deepwater.daisy.service.user;

import org.deepwater.daisy.entity.user.User;

public interface UserService {

    User loginByName(String userName);
}
