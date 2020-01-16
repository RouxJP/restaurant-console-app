package dev.service;

import dev.entite.Plat;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface IPlatService {

    List<Plat> listerPlats();

    void ajouterPlat(String nomPlat, Integer prixPlat);
}
