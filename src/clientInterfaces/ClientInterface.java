/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author USER
 */
public interface ClientInterface extends Remote{
    public void recieveMessage(String message) throws RemoteException;
    public String getClientName() throws RemoteException;
    public int getId() throws RemoteException;
    public void recieveFile(String fileName, byte[] data) throws RemoteException;
}
