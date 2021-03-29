package ec.edu.espe;

import HW21_Menu.Menu_PrintText;
import javax.swing.JOptionPane;

public class codePrintText {
    String data [][] = new String [40][50];
    
    public void enterInfo(){
        
        int i = 0;
        
        if( i < data.length){
            String color=String.valueOf(Menu_PrintText.color.getText());
            String frame=String.valueOf(Menu_PrintText.frame.getText());
            String size=String.valueOf(Menu_PrintText.size.getText());
            
            data[i][0]=color;
            data[i][1]=frame;
            data[i][2]=size;
            
            JOptionPane.showMessageDialog(null, "Data Saved Successfully");
        }else{
            JOptionPane.showMessageDialog(null, "INSUFFICIENT SPACE");
        }
    }
    public void consultInfo(){
        
        String color=String.valueOf(Menu_PrintText.search.getText());
        
        boolean flag=false;
        for(int i=0; i<40; i++){
            if(color.equals(data[i][0])){
                String rep="number  |   name   |   team\n";
                Menu_PrintText.info.setText(rep + "" + data[i][0] + "     " + data[i][1] + "      " + data[i][2]+"\n");
                
                
                i=data.length;
                flag=true;
            }
        }
        if(flag){
            
            JOptionPane.showMessageDialog(null, "Data Found");
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Not Found");
            
        }
    }
    public void showInfo(){
        String rep = "color   |    frame   |   size\n";
        for(int j=0; j<data.length; j++){
            
            rep  +=  data[j][0] + "\t" + data[j][1] + "\t" + data[j][2] + "\n";
            Menu_PrintText.info.setText(rep);
            for(int i=0; i<data.length; i++){
                if(data[i][j] == null){
                    data[i][j]="";
                }
            }
        }
    }
    public void delet(){
        String color=String.valueOf(Menu_PrintText.search.getText());
        
        boolean flag=false;
        for(int i=0; i<40; i++){
            if(color.equals(data[i][0])){
                String rep="color  |   frame   |   size\n";
                data[i][0] = "     ";
                data[i][1] = "     ";
                data[i][2] = "     ";
                
                
                i=data.length;
                flag=true;
            }
        }
        if(flag){
            
            JOptionPane.showMessageDialog(null, "Data Found");
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Not Found");
            
        }
    }
}
