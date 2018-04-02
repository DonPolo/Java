/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

import java.util.ArrayList;

/**
 *
 * @author p1706363
 */
public class ListeMembres {
    
    private ArrayList<MembreBibliotheque> members;

    public ListeMembres(){
        members = new ArrayList<MembreBibliotheque>();
    }
    
    public void addMember(MembreBibliotheque member){
        members.add(member);
    }
    
    public MembreBibliotheque getMember(int memberNumber){
        for(MembreBibliotheque mb : members){
            if(mb.getNumAbo() == memberNumber){
                return mb;
            }
        }
        
        return null;
    }
    
    public ArrayList<MembreBibliotheque> getMembers(){
        return members;
    }
}
