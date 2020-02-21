package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import androidx.annotation.Nullable;

public interface ApiService {
    List<User> getUsers(); // methodes de l'ApiService
    void generateRandomUser();
    void deleteUser(User username);
}
