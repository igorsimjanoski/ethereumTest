package com.ethereum;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.ipc.WindowsIpcService;


public class Main {

  
  public static void main(String[] args) {
    try {
      Web3j web3 = Web3j.build(new HttpService());
      //Web3j web3 = Web3j.build(new WindowsIpcService("\\\\.\\pipe\\geth.ipc"));
      Web3ClientVersion clientVersion = web3.web3ClientVersion().sendAsync().get();
      String version = clientVersion.getWeb3ClientVersion();
      System.out.println(String.format("Version is %s", version));
    } catch (Exception e) {
      System.out.println(e);
    }
    
    
  }
  
}
