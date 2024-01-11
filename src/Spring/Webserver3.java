package Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
        public static void main(String[] args) {
            try{
                ServerSocket serverSocket = new ServerSocket(8081);
                System.out.println("8081서비스 시작");

//                POST /somepath HTTP/1.1
//                Host: localhost:8081
//                Content-Type: application/x-www-form-urlencoded
//                Content-Length: xx
//
//                username=helloworld

                while (true){
                    try(Socket socket = serverSocket.accept()) {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        StringBuilder sb = new StringBuilder();
                        String line = "";
//                        readLine : 1줄 read
//                        read : 전체 read
                        while(!(line = br.readLine()).isBlank()){
                            sb.append(line+"\n");
                        }
                        if(sb.toString().contains("POST")){
                            char[] buffer = new char[1024];
                            br.read(buffer);
                            System.out.println("POST body data : " + new String(buffer));
                            System.out.println("POST header data : " + sb.toString());
                        }
                        String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "ok";
                        socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


