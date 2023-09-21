/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.iterator;

/**
 *
 * @author pavankumar.boyapati
 */
public class Channel {
  private double frequency;
  private ChannelTypeEnum TYPE;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    public void setTYPE(ChannelTypeEnum TYPE) {
        this.TYPE = TYPE;
    }

    public Channel(double frequency, ChannelTypeEnum TYPE) {
        this.frequency = frequency;
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" + "frequency=" + frequency + ", TYPE=" + TYPE + '}';
    }
    
    
    
    
}
