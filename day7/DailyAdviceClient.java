package com.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/17.
 */
public class DailyAdviceClient {
    public void go(){

            try {
                Socket s = new Socket("127.0.0.1", 4242);
                InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);

                String advice = reader.readLine();
                System.out.println("Today you should; " + advice);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    public static void main(String[] args){
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
