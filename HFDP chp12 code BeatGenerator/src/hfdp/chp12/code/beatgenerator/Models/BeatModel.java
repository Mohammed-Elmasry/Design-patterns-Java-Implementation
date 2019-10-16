/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp12.code.beatgenerator.Models;

import java.util.*;
import javax.sound.midi.*;

/**
 *
 * @author Mohammed Hussein
 */
public class BeatModel implements BeatModelInterface{
    Sequencer sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;
        
    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(bpm);
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return this.bpm;
    }
    
    void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void notifyBeatObservers(){
        for (int i = 0; i < beatObservers.size(); i++){
            BeatObserver observer = (BeatObserver) beatObservers.get(i);
        observer.updateBeat();
        }
    }
}
