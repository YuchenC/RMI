/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

import common.Client;
import common.File;
import common.MessageException;

import java.rmi.RemoteException;

/**
 *
 * @author yuchen
 */
public class User {
    private final String username;
    private Client remoteNode;
    private UserManager participantMgr;
    private static final String DEFAULT_USERNAME = "anonymous";
    
    public User(String username, Client remoteNode, UserManager mgr){
        this.username = username;
        this.remoteNode = remoteNode;
        this.participantMgr = mgr;
    }
    
    public User(long id, Client remoteNode, UserManager mgr) {
        this(DEFAULT_USERNAME, remoteNode, mgr);
    }
    
    public void send(String msg){
        try {
            remoteNode.recvMsg(msg);
        } catch(RemoteException re) {
            throw new MessageException("Failed to deliver message to " + username + ".");
        }
    }
    
    public boolean hasRemoteNode(Client remoteNode) {
        return remoteNode.equals(this.remoteNode);
    }
    
}
