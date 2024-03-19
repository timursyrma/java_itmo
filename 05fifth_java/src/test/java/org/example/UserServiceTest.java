package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testAddUser() {
        // Arrange
        User user = new User(1, "John");

        // Act
        userService.addUser(user);

        // Assert
        Assertions.assertEquals(1, userService.getUsers().size());
    }

    @Test
    public void testGetUsers() {
        // Arrange
        userService.addUser(new User(1, "John"));
        userService.addUser(new User(2, "Alice"));

        // Act
        List<User> users = userService.getUsers();

        // Assert
        Assertions.assertEquals(2, users.size());
        Assertions.assertEquals("John", users.get(0).getName());
        Assertions.assertEquals("Alice", users.get(1).getName());
    }


    @Test
    public void testGetUserById_UserNotFound() {
        // Act
        User user = userService.getUserById(1);

        // Assert
        Assertions.assertNull(user);
    }
}
