/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pavankumar.boyapati
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;
    
    public ChannelCollectionImpl(){
        this.channelList=new ArrayList<>();
    }
    
 
    public void addChannel(Channel c) {
    
        this.channelList.add(c);
        
    }

   
    public void removeChannel(Channel c) {
    
        this.channelList.remove(c);
    }

 
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelList);
    
    }
    
private class ChannelIteratorImpl implements ChannelIterator{

    
    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }
    
        @Override
        public boolean hasNext() {
        
            while(position<channels.size()){
                Channel c= channels.get(position);
                if(c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                    return true;
                }
                else{
                    position++;
                }  
            }
            return false;
        }
        

        @Override
        public Channel next() {
        
            Channel c= channels.get(position);
            position++;
            return c;
            
        }
    
    
}
    
    
}
