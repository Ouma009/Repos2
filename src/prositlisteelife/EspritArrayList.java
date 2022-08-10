/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositlisteelife;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author FGH
 */
public class EspritArrayList implements University{
    
    private List<Etudiant> listEtd;

    public EspritArrayList() {
        listEtd = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        listEtd.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return listEtd.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {

        for (int i = 0; i < listEtd.size(); i++) {
            if (listEtd.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        listEtd.remove(e);
    }

    @Override
    public void displayEtudiants() {
        //1er Methode        
        for (int i = 0; i < listEtd.size(); i++) {
            System.out.println(listEtd.get(i).toString());
        }
        //2eme Methode
//        System.out.println(listEtd.toString());
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listEtd);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listEtd, new CompareEtudiantByNom());
    }
    
}
