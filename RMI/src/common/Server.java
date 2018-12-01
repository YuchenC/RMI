/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author yuchen
 */
public interface Server extends Remote{
    public static final String SERVER_NAME_IN_REGISTRY = "Server";
    
    void login(Client remoteNode, Credentials credentials) throws RemoteException;
    
    void leaveConversation(long id) throws RemoteException;
}
