import java.io.*;  

import java.net.*;

import java.util.*;  

public class myserver {  

public static void main(String[] args) throws Exception {  

try{  

ServerSocket ss=new ServerSocket(36726);  

Socket s=ss.accept();//establishes connection   

DataInputStream dis=new DataInputStream(s.getInputStream());

DataOutputStream out = new DataOutputStream(s.getOutputStream());

out.writeBytes("Server Date: " + (new Date()).toString() + "\n");

out.close();

s.close();  

String  str=(String)dis.readUTF();  

System.out.println("message= "+str);  

ss.close();  

}catch(Exception e){System.out.println(e);}  

}  

}  
