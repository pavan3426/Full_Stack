/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.commandpattern;

/**
 *
 * @author pavankumar.boyapati
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening File in Unix Os ...");
    }

    @Override
    public void writeFile() {
     System.out.println("Writing File in Unix Os ..."); }

    @Override
    public void closeFile() {
      System.out.println("Closing File in Unix Os ...");  }
    
}
