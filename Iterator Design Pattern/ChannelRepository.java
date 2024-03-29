/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iteratordp;

/**
 *
 * @author ACER
 */
public class ChannelRepository implements Container {
    
    String c[]={"Sony Pal" , "SAB TV" ,"History TV" , "Discovery TV"};
    @Override
    public Iterator getIterator(){
        return new ChannelIterator();
    }
    
    private class ChannelIterator implements Iterator {
      int index;
      @Override
      public boolean hasNext() {
        if(index < c.length)
            return true;
        return false;
      }

      @Override
      public Object next() {     
         if(this.hasNext())
            return c[index++];
         return null;
      }		
   }
    
}
