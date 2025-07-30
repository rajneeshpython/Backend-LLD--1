package designpattern.PrototypeRegistry.assignment;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements  UserPrototypeRegistry {
    private final Map<UserType, User> usersPrototypeRegistry = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        usersPrototypeRegistry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return usersPrototypeRegistry.get(type);
    }

    @Override
    public User clone(UserType type) {
        User user = usersPrototypeRegistry.get(type);
        if (user == null) {
            throw new IllegalArgumentException("User " + type + " does not exist");
        }
        return user.cloneObject();
    }
}
