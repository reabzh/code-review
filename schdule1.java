/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author reema
 */
public class schdule {
    
    schdule schdules; //we assume that all schdule alredy in the system
    int days[]= new int[31];
    int months[]= new int[12];
    int years[]= new int[2022];
    
    
    //we assume that all schdule alredy in the system
    public void searchInSchdule( int day, int month, int year){
      int i=1;
        while(i<10000){
            if(days[i]==day && months[i]== month && years[i]==year)
                System.out.println(days[i]+" ,"+months[i]+", "+years[i]); //it would print the schedule who have the same entries
        i++;
        }        
        System.out.println("Couldn't find the schedule");
    }
}


