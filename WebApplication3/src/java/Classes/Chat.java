/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author EloiRivière
 */
public class Chat extends Animal{

    public Chat(String nom, String race) {
        super(nom, race);
    }

    @Override
    public String cri() {
        return "Miaulement";
    }
    
    
}
