package HW20;

import javax.swing.JOptionPane;

public class CodeCompetitorsList {
    
    String data [][] = new String [40][50];
    
    public void enterInfo(){
        
        int i = 0;
        
        if( i < data.length){
            String number=String.valueOf(Menu_CompetitorsList.num.getText());
            String name=String.valueOf(Menu_CompetitorsList.name.getText());
            String team=String.valueOf(Menu_CompetitorsList.team.getText());
            
            data[i][0]=number;
            data[i][1]=name;
            data[i][2]=team;
            
            JOptionPane.showMessageDialog(null, "Data Saved Successfully");
        }else{
            JOptionPane.showMessageDialog(null, "INSUFFICIENT SPACE");
        }
    }
    public void consultInfo(){
        
        String number=String.valueOf(Menu_CompetitorsList.search.getText());
        
        boolean flag=false;
        for(int i=0; i<40; i++){
            if(number.equals(data[i][0])){
                String rep="number  |   name   |   team\n";
                Menu_CompetitorsList.info.setText(rep + "" + data[i][0] + "     " + data[i][1] + "      " + data[i][2]+"\n");
                
                
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
        String rep = "Number   |    Name   |   Team\n";
        for(int j=0; j<data.length; j++){
            
            rep  +=  data[j][0] + "\t" + data[j][1] + "\t" + data[j][2] + "\n";
            Menu_CompetitorsList.info.setText(rep);
            for(int i=0; i<data.length; i++){
                if(data[i][j] == null){
                    data[i][j]="";
                }
            }
        }
    }
    public void delet(){
        String number=String.valueOf(Menu_CompetitorsList.search.getText());
        
        boolean flag=false;
        for(int i=0; i<40; i++){
            if(number.equals(data[i][0])){
                String rep="number  |   name   |   team\n";
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