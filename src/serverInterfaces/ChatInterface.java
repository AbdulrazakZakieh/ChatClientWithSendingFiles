/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverInterfaces;

import clientInterfaces.ClientInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author USER
 */
public interface ChatInterface extends Remote{
    public String LOOKUP_NAME = "Chat";
    public void signIn(ClientInterface c) throws RemoteException;
    public void sendToAll(ClientInterface sender, String message) throws RemoteException;
    public void sendFile(ClientInterface sender, int recieverID, String fileName, byte[] data) throws RemoteException;
}
