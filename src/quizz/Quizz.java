package quizz;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Formation
 */
public class Quizz {

    private String titre;
    private ArrayList questions = new ArrayList();
    private int score = 0;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList questions) {
        this.questions = questions;
    }

    public void jouerQuizz() {

        //afficher le menu principal
        boolean quitter = false;
        while (quitter == false) {
            System.out.println("Menu principal :\n"
                    + "[1] Creer un nouveau quizz.\n"
                    + "[2] Lancer le Quizz.\n"
                    + "\n"
                    + "Votre choix : ");

            Scanner scan = new Scanner(System.in);
            String ChoixUtil = scan.nextLine();
            switch (ChoixUtil) {
                case "1":
                    creerQuizz();
                    break;
                case "2":
                    lancerQuizz();
                    break;
                default:
                    System.out.println("Ce choix n'existe pas");
                    break;
            }

        }
        while (quitter == false);

    }

    private void creerQuizz() {
        boolean sortir = false;

        while (sortir == false) {

            System.out.println("Veuillez entrer votre question :");
            Scanner question = new Scanner(System.in);
            String question1 = question.nextLine();

            Question nouvelle = new Question();
            nouvelle.setTitreQuestion(question1);

            this.questions.add(nouvelle);
            System.out.println("La nouvelle question sera : " + question1);

            System.out.println("veuillez indiquer les differentes reponses possible :");
            Scanner rep1 = new Scanner(System.in);
            String reponse1 = rep1.nextLine();
            nouvelle.setReponse1(reponse1);
            Scanner rep2 = new Scanner(System.in);
            String reponse2 = rep2.nextLine();
            nouvelle.setReponse2(reponse2);
            Scanner rep3 = new Scanner(System.in);
            String reponse3 = rep3.nextLine();
            nouvelle.setReponse3(reponse3);
            Scanner rep4 = new Scanner(System.in);
            String reponse4 = rep4.nextLine();
            nouvelle.setReponse4(reponse4);

            System.out.println("Voici les differentes reponses : \n"
                    + "[1] " + reponse1 + "\n"
                    + "[2] " + reponse2 + "\n"
                    + "[3] " + reponse3 + "\n"
                    + "[4] " + reponse4 + "\n");

            System.out.println("Determiner la bonne reponse :");
            Scanner bonneRep = new Scanner(System.in);
            int bonneReponse = bonneRep.nextInt();
            nouvelle.setNumRepCorrect(bonneReponse);

            boolean yesNo = false;
            while (yesNo == false) {

                System.out.println("Voulez-vous ajouter une question ?\n"
                        + "[1] Oui\n"
                        + "[2] Non\n");
                Scanner choix = new Scanner(System.in);
                String YN = choix.nextLine();

                switch (YN) {
                    case "1":
                        yesNo = true;
                        break;

                    case "2":
                        yesNo = true;
                        sortir = true;
                        break;
                    default:
                        yesNo = false;

                }
            }
        }
    }

    private void lancerQuizz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
