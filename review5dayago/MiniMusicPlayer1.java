package com.review5dayago;

import javax.sound.midi.*;

/**
 * Created by Administrator on 2017/7/16.
 */
public class MiniMusicPlayer1 {
    public static void main(String[] args){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for(int i = 5; i < 61; i += 4){
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 1));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e){
            e.printStackTrace();
        }
        return event;
    }
}
