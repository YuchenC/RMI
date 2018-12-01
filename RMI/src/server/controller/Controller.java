package server.controller;

import common.Client;
import common.Credentials;
import common.Server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import server.model.User;
import server.model.UserManager;

/**
 *
 * @author yuchen
 */
public class Controller  extends UnicastRemoteObject implements Server {
    private final Random idGenerator = new Random();
    private final UserManager userMgr = new UserManager();


    public Controller() throws RemoteException {
    }
    
    @Override
    public void login(Client remoteNode, Credentials credentials) throws RemoteException {        
        userMgr.createUser(remoteNode, credentials);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void leaveConversation(long id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

