package service;

import data.Voiture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StatistiqueTest {
    @Mock   // <----  indique que mockStatistique est un mock qui va simuler les opérations de l'interface Statistique
    Statistique mockStatistique;

    @Test
    public void un_exemple_de_test(){
        mockStatistique = Mockito.mock(Statistique.class);
    }


}