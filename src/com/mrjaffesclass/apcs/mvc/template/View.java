package com.mrjaffesclass.apcs.mvc.template;
import com.mrjaffesclass.apcs.messenger.*;
import java.awt.Color;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 * MVC Template
 * This is a template of an MVC framework used by APCS for the 
 * LandMine project (and others)
 * @author Roger Jaffe
 * @version 1.0
 * 
 */
public class View extends javax.swing.JFrame implements MessageHandler {

  private final Messenger mvcMessaging;
  
  /**
   * Creates a new view
   * @param messages mvcMessaging object
   */
  public View(Messenger messages) {
    mvcMessaging = messages;   // Save the calling controller instance
    initComponents();           // Create and init the GUI components
  }
  JButton[][] buttons = new JButton[8][8];  
  JButton[] button = new JButton[64];
  /**
   * Initialize the model here and subscribe
   * to any required messages
   */
  public void init() {
    // Subscribe to messages here
     mvcMessaging.subscribe("model:variable1Changed", this);
     mvcMessaging.subscribe("model:variable2Changed", this);
     mvcMessaging.subscribe("model:mine", this);
     mvcMessaging.subscribe("model:noMine",this);
     
    buttons[0][0] = jButton1;
    buttons[0][1] = jButton2;
    buttons[0][2] = jButton3;
    buttons[0][3] = jButton4;
    buttons[0][4] = jButton5;
    buttons[0][5] = jButton6;
    buttons[0][6] = jButton7;
    buttons[0][7] = jButton8;
    buttons[1][0] = jButton9;
    buttons[1][1] = jButton10;
    buttons[1][2] = jButton11;
    buttons[1][3] = jButton12;
    buttons[1][4] = jButton13;
    buttons[1][5] = jButton14;
    buttons[1][6] = jButton15;
    buttons[1][7] = jButton16;
    buttons[2][0] = jButton17;
    buttons[2][1] = jButton18;
    buttons[2][2] = jButton19;
    buttons[2][3] = jButton20;
    buttons[2][4] = jButton21;
    buttons[2][5] = jButton22;
    buttons[2][6] = jButton23;
    buttons[2][7] = jButton24;
    buttons[3][0] = jButton25;
    buttons[3][1] = jButton26;
    buttons[3][2] = jButton27;
    buttons[3][3] = jButton28;
    buttons[3][4] = jButton29;
    buttons[3][5] = jButton30;
    buttons[3][6] = jButton31;
    buttons[3][7] = jButton32;
    buttons[4][0] = jButton33;
    buttons[4][1] = jButton34;
    buttons[4][2] = jButton35;
    buttons[4][3] = jButton36;
    buttons[4][4] = jButton37;
    buttons[4][5] = jButton38;
    buttons[4][6] = jButton39;
    buttons[4][7] = jButton40;
    buttons[5][0] = jButton41;
    buttons[5][1] = jButton42;
    buttons[5][2] = jButton43;
    buttons[5][3] = jButton44;
    buttons[5][4] = jButton45;
    buttons[5][5] = jButton46;
    buttons[5][6] = jButton47;
    buttons[5][7] = jButton48;
    buttons[6][0] = jButton49;
    buttons[6][1] = jButton50;
    buttons[6][2] = jButton51;
    buttons[6][3] = jButton52;
    buttons[6][4] = jButton53;
    buttons[6][5] = jButton54;
    buttons[6][6] = jButton55;
    buttons[6][7] = jButton56;
    buttons[7][0] = jButton57;
    buttons[7][1] = jButton58;
    buttons[7][2] = jButton59;
    buttons[7][3] = jButton60;
    buttons[7][4] = jButton61;
    buttons[7][5] = jButton62;
    buttons[7][6] = jButton63;
    buttons[7][7] = jButton64;
     
    button[0] = jButton1;
    button[1] = jButton9;
    button[2] = jButton17;
    button[3] = jButton25;
    button[4] = jButton33;
    button[5] = jButton41;
    button[6] = jButton49;
    button[7] = jButton57;
    button[8] = jButton2;
    button[9] = jButton10;
    button[10] = jButton18;
    button[11] = jButton64;
    button[12] = jButton26;
    button[13] = jButton34;
    button[14] = jButton42;
    button[15] = jButton50;
    button[16] = jButton58;
    button[17] = jButton3;
    button[18] = jButton11;
    button[19] = jButton19;
    button[20] = jButton27;
    button[21] = jButton35;
    button[22] = jButton43;
    button[23] = jButton51;
    button[24] = jButton59;
    button[25] = jButton4;
    button[26] = jButton12;
    button[27] = jButton20;
    button[28] = jButton28;
    button[29] = jButton36;
    button[30] = jButton44;
    button[31] = jButton52;
    button[32] = jButton60;
    button[33] = jButton5;
    button[34] = jButton13;
    button[35] = jButton21;
    button[36] = jButton29;
    button[37] = jButton37;
    button[38] = jButton45;
    button[39] = jButton53;
    button[40] = jButton61;
    button[41] = jButton6;
    button[42] = jButton14;
    button[43] = jButton22;
    button[44] = jButton30;
    button[45] = jButton38;
    button[46] = jButton46;
    button[47] = jButton54;
    button[48] = jButton62;
    button[49] = jButton7;
    button[50] = jButton15;
    button[51] = jButton23;
    button[52] = jButton31;
    button[53] = jButton39;
    button[54] = jButton47;
    button[55] = jButton55;
    button[56] = jButton63;
    button[57] = jButton8;
    button[58] = jButton16;
    button[59] = jButton24;
    button[60] = jButton32;
    button[61] = jButton40;
    button[62] = jButton48;
    button[63] = jButton56; 
          
  }
 
  public Point findButton(JButton thisWasClicked)
  {
      Point foundIt = null;
      for (int row = 0; row < 8; row++)
      {
          for (int col = 0; col < 8; col++)
          {
          if(thisWasClicked.equals(buttons[row][col]))
                  {
                      foundIt = new Point(row, col);
                  }
                  
          }
          
      }
      return foundIt;
  }
                  
      
          
 
 



  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("MSG: received by view: "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("MSG: received by view: "+messageName+" | No data sent");
    }
    if (messageName.equals("model:variable1Changed")) 
    {
      jLabel4.setText(messagePayload.toString());
      if(Integer.parseInt(messagePayload.toString()) == 54)
      {
          jLabel6.setText("YOU WON!"); 
          
      }
    } 
    else if(messageName.equals("model:variable2Changed"))
    {
      jLabel2.setText(messagePayload.toString());
      
      if(Integer.parseInt(messagePayload.toString()) == 0)
      {
          jLabel6.setText("GAME OVER");
          for(int i = 0; i<64; i++)
          {
              button[i].setEnabled(false);
          }
      }
      if(Integer.parseInt(messagePayload.toString()) > 0)
      {
          jButton65.setVisible(false);
      }
      if(Integer.parseInt(messagePayload.toString()) == 0)
      {
          jButton65.setVisible(true);
      }
      
      
      
    }
    else if(messageName.equals("model:mine"))
    {
        int b = Integer.parseInt(messagePayload.toString());
        button[b].setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/bomb5.png")));
        button[b].setEnabled(false);
        button[b].setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/bomb5.png"))); 
    }
    
    else if(messageName.equals("model:noMine"))
    {
        int c = Integer.parseInt(messagePayload.toString());
        
        button[c].setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/coin.png")));
        button[c].setEnabled(false);
        button[c].setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/coin.png"))); 
    }
    
    
    
    
    
  }

  /**
   * Instantiate an object with the field number that was clicked (1 or 2) and
   * the direction that the number should go (up or down)
   * @param number 1 or 2 for the field being modified
   * @param direction this.UP (1) or this.DOWN (-1), constants defined above
   * @return the HashMap payload to be sent with the message
   */
  
  
  private MessagePayload createPayload(int number, boolean mine) {
    
      MessagePayload payload = new MessagePayload(number, mine);
    return payload; 
    
  }
  

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton65 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(350, 350));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton5, gridBagConstraints);

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton6, gridBagConstraints);

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setForeground(new java.awt.Color(0, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton7.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton7, gridBagConstraints);

        jButton8.setBackground(new java.awt.Color(0, 255, 255));
        jButton8.setForeground(new java.awt.Color(0, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton8.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton8, gridBagConstraints);

        jButton9.setBackground(new java.awt.Color(0, 255, 255));
        jButton9.setForeground(new java.awt.Color(0, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton9.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton9, gridBagConstraints);

        jButton10.setBackground(new java.awt.Color(0, 255, 255));
        jButton10.setForeground(new java.awt.Color(0, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton10, gridBagConstraints);

        jButton11.setBackground(new java.awt.Color(0, 255, 255));
        jButton11.setForeground(new java.awt.Color(0, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton11.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton11, gridBagConstraints);

        jButton12.setBackground(new java.awt.Color(0, 255, 255));
        jButton12.setForeground(new java.awt.Color(0, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton12.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton12, gridBagConstraints);

        jButton13.setBackground(new java.awt.Color(0, 255, 255));
        jButton13.setForeground(new java.awt.Color(0, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton13.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton13, gridBagConstraints);

        jButton14.setBackground(new java.awt.Color(0, 255, 255));
        jButton14.setForeground(new java.awt.Color(0, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton14.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton14, gridBagConstraints);

        jButton15.setBackground(new java.awt.Color(0, 255, 255));
        jButton15.setForeground(new java.awt.Color(0, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton15.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton15, gridBagConstraints);

        jButton16.setBackground(new java.awt.Color(0, 255, 255));
        jButton16.setForeground(new java.awt.Color(0, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton16.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton16, gridBagConstraints);

        jButton17.setBackground(new java.awt.Color(0, 255, 255));
        jButton17.setForeground(new java.awt.Color(0, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton17.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton17, gridBagConstraints);

        jButton18.setBackground(new java.awt.Color(0, 255, 255));
        jButton18.setForeground(new java.awt.Color(0, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton18.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton18, gridBagConstraints);

        jButton19.setBackground(new java.awt.Color(0, 255, 255));
        jButton19.setForeground(new java.awt.Color(0, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton19.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton19, gridBagConstraints);

        jButton20.setBackground(new java.awt.Color(0, 255, 255));
        jButton20.setForeground(new java.awt.Color(0, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton20.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton20, gridBagConstraints);

        jButton21.setBackground(new java.awt.Color(0, 255, 255));
        jButton21.setForeground(new java.awt.Color(0, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton21.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton21, gridBagConstraints);

        jButton22.setBackground(new java.awt.Color(0, 255, 255));
        jButton22.setForeground(new java.awt.Color(0, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton22.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton22, gridBagConstraints);

        jButton23.setBackground(new java.awt.Color(0, 255, 255));
        jButton23.setForeground(new java.awt.Color(0, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton23.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton23, gridBagConstraints);

        jButton24.setBackground(new java.awt.Color(0, 255, 255));
        jButton24.setForeground(new java.awt.Color(0, 255, 255));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton24.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton24, gridBagConstraints);

        jButton25.setBackground(new java.awt.Color(0, 255, 255));
        jButton25.setForeground(new java.awt.Color(0, 255, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton25.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton25, gridBagConstraints);

        jButton26.setBackground(new java.awt.Color(0, 255, 255));
        jButton26.setForeground(new java.awt.Color(0, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton26.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton26, gridBagConstraints);

        jButton27.setBackground(new java.awt.Color(0, 255, 255));
        jButton27.setForeground(new java.awt.Color(0, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton27.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton27, gridBagConstraints);

        jButton28.setBackground(new java.awt.Color(0, 255, 255));
        jButton28.setForeground(new java.awt.Color(0, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton28.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton28, gridBagConstraints);

        jButton29.setBackground(new java.awt.Color(0, 255, 255));
        jButton29.setForeground(new java.awt.Color(0, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton29.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton29, gridBagConstraints);

        jButton30.setBackground(new java.awt.Color(0, 255, 255));
        jButton30.setForeground(new java.awt.Color(0, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton30.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton30, gridBagConstraints);

        jButton31.setBackground(new java.awt.Color(0, 255, 255));
        jButton31.setForeground(new java.awt.Color(0, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton31.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton31, gridBagConstraints);

        jButton32.setBackground(new java.awt.Color(0, 255, 255));
        jButton32.setForeground(new java.awt.Color(0, 255, 255));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton32.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton32, gridBagConstraints);

        jButton33.setBackground(new java.awt.Color(0, 255, 255));
        jButton33.setForeground(new java.awt.Color(0, 255, 255));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton33.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton33, gridBagConstraints);

        jButton34.setBackground(new java.awt.Color(0, 255, 255));
        jButton34.setForeground(new java.awt.Color(0, 255, 255));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton34.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton34, gridBagConstraints);

        jButton35.setBackground(new java.awt.Color(0, 255, 255));
        jButton35.setForeground(new java.awt.Color(0, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton35.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton35, gridBagConstraints);

        jButton36.setBackground(new java.awt.Color(0, 255, 255));
        jButton36.setForeground(new java.awt.Color(0, 255, 255));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton36.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton36, gridBagConstraints);

        jButton37.setBackground(new java.awt.Color(0, 255, 255));
        jButton37.setForeground(new java.awt.Color(0, 255, 255));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton37.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton37, gridBagConstraints);

        jButton38.setBackground(new java.awt.Color(0, 255, 255));
        jButton38.setForeground(new java.awt.Color(0, 255, 255));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton38.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton38, gridBagConstraints);

        jButton39.setBackground(new java.awt.Color(0, 255, 255));
        jButton39.setForeground(new java.awt.Color(0, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton39.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton39, gridBagConstraints);

        jButton40.setBackground(new java.awt.Color(0, 255, 255));
        jButton40.setForeground(new java.awt.Color(0, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton40.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton40, gridBagConstraints);

        jButton41.setBackground(new java.awt.Color(0, 255, 255));
        jButton41.setForeground(new java.awt.Color(0, 255, 255));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton41.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton41, gridBagConstraints);

        jButton42.setBackground(new java.awt.Color(0, 255, 255));
        jButton42.setForeground(new java.awt.Color(0, 255, 255));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton42.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton42, gridBagConstraints);

        jButton43.setBackground(new java.awt.Color(0, 255, 255));
        jButton43.setForeground(new java.awt.Color(0, 255, 255));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton43.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton43, gridBagConstraints);

        jButton44.setBackground(new java.awt.Color(0, 255, 255));
        jButton44.setForeground(new java.awt.Color(0, 255, 255));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton44.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton44, gridBagConstraints);

        jButton45.setBackground(new java.awt.Color(0, 255, 255));
        jButton45.setForeground(new java.awt.Color(0, 255, 255));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton45.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton45, gridBagConstraints);

        jButton46.setBackground(new java.awt.Color(0, 255, 255));
        jButton46.setForeground(new java.awt.Color(0, 255, 255));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton46.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton46, gridBagConstraints);

        jButton47.setBackground(new java.awt.Color(0, 255, 255));
        jButton47.setForeground(new java.awt.Color(0, 255, 255));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton47.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton47, gridBagConstraints);

        jButton48.setBackground(new java.awt.Color(0, 255, 255));
        jButton48.setForeground(new java.awt.Color(0, 255, 255));
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton48.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton48, gridBagConstraints);

        jButton49.setBackground(new java.awt.Color(0, 255, 255));
        jButton49.setForeground(new java.awt.Color(0, 255, 255));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton49.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton49, gridBagConstraints);

        jButton50.setBackground(new java.awt.Color(0, 255, 255));
        jButton50.setForeground(new java.awt.Color(0, 255, 255));
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton50.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton50, gridBagConstraints);

        jButton51.setBackground(new java.awt.Color(0, 255, 255));
        jButton51.setForeground(new java.awt.Color(0, 255, 255));
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton51.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton51, gridBagConstraints);

        jButton52.setBackground(new java.awt.Color(0, 255, 255));
        jButton52.setForeground(new java.awt.Color(0, 255, 255));
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton52.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton52, gridBagConstraints);

        jButton53.setBackground(new java.awt.Color(0, 255, 255));
        jButton53.setForeground(new java.awt.Color(0, 255, 255));
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton53.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton53, gridBagConstraints);

        jButton54.setBackground(new java.awt.Color(0, 255, 255));
        jButton54.setForeground(new java.awt.Color(0, 255, 255));
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton54.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton54, gridBagConstraints);

        jButton55.setBackground(new java.awt.Color(0, 255, 255));
        jButton55.setForeground(new java.awt.Color(0, 255, 255));
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton55.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton55, gridBagConstraints);

        jButton56.setBackground(new java.awt.Color(0, 255, 255));
        jButton56.setForeground(new java.awt.Color(0, 255, 255));
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton56.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton56, gridBagConstraints);

        jButton57.setBackground(new java.awt.Color(0, 255, 255));
        jButton57.setForeground(new java.awt.Color(0, 255, 255));
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton57.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jButton57, gridBagConstraints);

        jButton58.setBackground(new java.awt.Color(0, 255, 255));
        jButton58.setForeground(new java.awt.Color(0, 255, 255));
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton58.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton58, gridBagConstraints);

        jButton59.setBackground(new java.awt.Color(0, 255, 255));
        jButton59.setForeground(new java.awt.Color(0, 255, 255));
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton59.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton59, gridBagConstraints);

        jButton60.setBackground(new java.awt.Color(0, 255, 255));
        jButton60.setForeground(new java.awt.Color(0, 255, 255));
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton60.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton60, gridBagConstraints);

        jButton61.setBackground(new java.awt.Color(0, 255, 255));
        jButton61.setForeground(new java.awt.Color(0, 255, 255));
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton61.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton61, gridBagConstraints);

        jButton62.setBackground(new java.awt.Color(0, 255, 255));
        jButton62.setForeground(new java.awt.Color(0, 255, 255));
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton62.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jButton62, gridBagConstraints);

        jButton63.setBackground(new java.awt.Color(0, 255, 255));
        jButton63.setForeground(new java.awt.Color(0, 255, 255));
        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton63.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        getContentPane().add(jButton63, gridBagConstraints);

        jButton64.setBackground(new java.awt.Color(0, 255, 255));
        jButton64.setForeground(new java.awt.Color(0, 255, 255));
        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mrjaffesclass/apcs/mvc/template/images/question.png"))); // NOI18N
        jButton64.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton64, gridBagConstraints);

        jLabel1.setText("Lives:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Points:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("LANDMINE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        getContentPane().add(jLabel6, gridBagConstraints);

        jButton65.setBackground(new java.awt.Color(0, 255, 255));
        jButton65.setText("New Game");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        getContentPane().add(jButton65, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        mvcMessaging.notify("view:changeButton", createPayload(0,true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(1, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(2, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(3, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(4, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(5, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(6, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(7, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
        
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(8, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(9, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(10, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(12, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(13, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(14, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(15, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(16, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(17, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(18, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(19, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(20, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(21, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(22, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(23, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(24, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(25, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(26, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(27, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(28, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(29, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(30, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(31, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(32, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(33, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(34, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(35, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(36, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(37, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(38, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(39, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(40, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(41, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(42, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(43, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(44, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(45, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(46, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(47, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(48, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(49, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(50, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(51, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(52, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(53, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(54, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(55, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(56, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(57, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(58, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(59, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(60, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(61, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(62, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
       mvcMessaging.notify("view:changeButton", createPayload(63, true), true);
       JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        mvcMessaging.notify("view:changeButton", createPayload(11, true), true);
        JButton thisWasClicked = (JButton)evt.getSource();
        thisWasClicked.setBackground(Color.red);
        Point foundIt = findButton(thisWasClicked);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        
        
        this.dispose();
        Controller.main (null);  
        
        
        
        
    }//GEN-LAST:event_jButton65ActionPerformed


  /**
   * @param args the command line arguments
   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
