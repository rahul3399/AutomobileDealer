/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Dell
 */
public class Excelexport {
    public Excelexport(){}
     public void toExcel( JTable table,File file)throws IOException{
        try{
            TableModel model = table.getModel();
            FileWriter excel = new FileWriter(file);
            BufferedWriter br=new BufferedWriter(excel);

            for(int i = 0; i < model.getColumnCount(); i++){
                br.write(model.getColumnName(i) + "\t");
                // System.out.println(model.getColumnName(i));
            
            }
            br.write("\n");
            
           // System.out.println("ROW COUNT ------------------------------");
            //System.out.println(model.getRowCount());
            
            for(int i=0; i< model.getRowCount(); i++) {
               // System.out.println("COLUMN COUNT ------------------------------");
               // System.out.println(model.getColumnCount());
                for(int j=0; j < model.getColumnCount(); j++) {
                    br.write(model.getValueAt(i,j).toString()+"\t");
                    //System.out.println(model.getValueAt(i,j).toString());
                }
                br.write("\n");
                
            }
            
            br.close();
           // System.out.println("write"+file);

        } catch(IOException e){ 
        
        }
    }
}
