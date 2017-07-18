package com.day8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/18.
 */
public class SimpleChatClient2 {
    JTextArea incoming;
    JTextField outgoning;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;
    public static void main(String[] args){
        SimpleChatClient1 client = new SimpleChatClient1();
        client.go();
    }
    public void go(){
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(10, 20);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoning = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SimpleChatClient2.SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoning);
        mainPanel.add(sendButton);
        setUpNetworking();

        Thread readerThread = new Thread(new SimpleChatClient2.IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try {
            sock = new Socket("127.0.0.1", 5001);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev){
            try {
                writer.println(outgoning.getText());
                writer.flush();
            } catch (Exception ex){
                ex.printStackTrace();
            }
            outgoning.setText("");
            outgoning.requestFocus();
        }
    }
    public class IncomingReader implements Runnable{
        public void run(){
            String message;

            try {
                while((message = reader.readLine()) != null){
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                    System.out.println(incoming.getText());
                }
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }


}
