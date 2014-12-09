package com.mrjaffesclass.apcs.mvc.template;

/**
 * This is the message payload class.  Instantiate this class when sending
 * field / value message data for the up/down buttons
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class MessagePayload {
  
  private final int number;
  private final boolean mine;
  
  /**
   * Class constructor
   * @param _number number
   * @param _mine mine
   */
  public MessagePayload(int _number, boolean _mine) {
    number = _number;
    mine = _mine;
  }
  
  /**
   * Getter method for the direction
   * @return Field value
   */
  public int getNumber() {
    return number;
  }
  
  public boolean getBoolean()
  {
      return mine;
  }
  
 
  /**
   * Getter method for the 
   * @return 
   */
  
  
}
