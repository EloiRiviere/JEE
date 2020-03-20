/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author EloiRivière
 */
public class BeanTransfert implements Serializable {
    
    List<Animal> listeAnimaux;

    public BeanTransfert() {
    }

    public List<Animal> getListeAnimaux() {
        return listeAnimaux;
    }

    public void setListeAnimaux(List<Animal> listeAnimaux) {
        this.listeAnimaux = listeAnimaux;
    }
}
