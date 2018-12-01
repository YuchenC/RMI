/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

import common.Client;
import common.Credentials;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import java.util.Random;


/**
 *
 * @author yuchen
 */
public class UserManager {
    private final Random idGenerator = new Random();
    private final Catalog catalog = new Catalog();
    private final Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());
    
    public long createUser(Client remoteNode, Credentials credentials) {
        long uid = idGenerator.nextLong();
        User newUser = new User(credentials.getUsername(),
                                                     remoteNode, this);
        users.put(uid, newUser);
        return uid;
    }
    
    // send list of files to this current user
    public void sendLsToUser(long id) {
        User user = users.get(id);
        for (String file : catalog.getFiles()) {
            user.send(file);
        }
    }
    
    public User getUser(long id) {
        return users.get(id);
    }
    
    public void removeUser(long id) {
        users.remove(id);
    }
    
    
    
    
    
}
