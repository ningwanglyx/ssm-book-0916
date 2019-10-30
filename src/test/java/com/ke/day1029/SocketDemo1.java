package com.ke.day1029;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/29 20:34
 * @Modified By:
 */
public class SocketDemo1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str = "hello java";
            bw.write(str);
            bw.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
