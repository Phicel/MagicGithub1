package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    // création du UserRepository
    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    // méthode renvoyant l'User
    public List<User> getUsers() {
        // TODO: A modifier
        // return null;
        return apiService.getUsers(); // A VERIFIER //
    }

    // générateur d'utilisateurs
    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser(); // A VERIFIER //
    }

    // retirer un user de la list
    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user); // A VERIFIER //
    }
}
