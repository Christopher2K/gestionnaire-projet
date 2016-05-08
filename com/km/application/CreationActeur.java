package com.km.application;

import com.km.projet.elements.Projet;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import com.km.controleur.CreationActeurControleur;

import java.net.URL;

/**
 * Auteur : Christopher
 * Date :   6 Mai 2016
 * Objet : Objet générant une fenêtre de création d'acteur
 */
public class CreationActeur
{
    public static void show(Projet projet, String title) throws Exception
    {
        Stage stage = new Stage();
        final URL url = CreationActeur.class.getResource("/com/km/vue/CreationActeur.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        Parent root = fxmlLoader.load();

        CreationActeurControleur controller = fxmlLoader.getController();

        //Configuration du choiceBox
        ChoiceBox cb = controller.saisie_choix;
        cb.setItems(FXCollections.observableArrayList(
            "Chef de projet", "Controleur de tache", "Responsable de tâche","Intervenant")
        );

        //Injection du stage
        controller.setStage(stage);


        controller.setProjet(projet);
        final Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
