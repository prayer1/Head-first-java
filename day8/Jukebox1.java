package com.day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<String>();
    public static void main(String[] args){
        new Jukebox1().go();
    }
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    void getSongs(){
        try {
            File file = new File("F:\\IDEA\\ideaProjects\\Head_First_Java\\src\\com\\day8\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void addSong(String line) {
        String[] tokens = line.split("/");
        songList.add(tokens[0]);
    }
}
