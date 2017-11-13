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
    private ArrayList<Question> questions = new ArrayList<>();

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

    public void menuPrincipal() {

        //afficher le menu principal
        boolean quitter = false;
        while (quitter == false) {
            System.out.println("Menu principal :\n"
                    + "[1] Creer un nouveau quizz.\n"
                    + "[2] Lancer le Quizz.\n"
                    + "[3] Quitter.\n"
                    + "Votre choix : ");

            Scanner scan = new Scanner(System.in);
            String ChoixUtil = scan.nextLine();
            switch (ChoixUtil) {
                case "1":
                    creerQuizz();
                    break;
                case "2":
                    lancerQuizz();
                    quitter = true;
                    break;
                case "3":
                    quitter = true;
                    break;
                default:
                    System.out.println("Ce choix n'existe pas");
                    break;
            }

        }

    }

    private void creerQuizz() {
        boolean sortir = false;

        while (sortir == false) {
            
            Question nouvelleQuestion =new Question();

            System.out.println("Veuillez entrer votre question :");
            Scanner question = new Scanner(System.in);
            nouvelleQuestion.setTitreQuestion( question.nextLine() );

            
            System.out.println("La nouvelle question sera : " + nouvelleQuestion);

            System.out.println("Veuillez indiquer les differentes reponses possible :");
            
            Scanner rep1 = new Scanner(System.in);
            String reponse1 = rep1.nextLine();
            nouvelleQuestion.setReponse1(reponse1);
            
            Scanner rep2 = new Scanner(System.in);
            String reponse2 = rep2.nextLine();
            nouvelleQuestion.setReponse2(reponse2);
            
            Scanner rep3 = new Scanner(System.in);
            String reponse3 = rep3.nextLine();
            nouvelleQuestion.setReponse3(reponse3);
            
            Scanner rep4 = new Scanner(System.in);
            String reponse4 = rep4.nextLine();
            nouvelleQuestion.setReponse4(reponse4);

            System.out.println("Voici les differentes reponses : \n"
                    + "[1] " + reponse1 + "\n"
                    + "[2] " + reponse2 + "\n"
                    + "[3] " + reponse3 + "\n"
                    + "[4] " + reponse4 + "\n");

            System.out.println("Determiner la bonne reponse :");
            Scanner bonneRep = new Scanner(System.in);
            int bonneReponse = bonneRep.nextInt();
            nouvelleQuestion.setNumRepCorrect(bonneReponse);
            
            // Ajoute la nouvelle question remblie (set) à la liste des questions du quiz
            questions.add(nouvelleQuestion);

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

        int score = 0;
        int repJoueur;
        
        System.out.println("Veuillez entre le nom du joueur : ");

        Scanner clavier = new Scanner(System.in);
        String nomJoueur = clavier.nextLine();

        //iterer (boucle) sur chaque questionActuelle de la liste des questionActuelle, pour l'afficher, 
        //demander les reponse et recalculer le score
        
        for (Question questionAct : questions) {
            System.out.println("Question actuelle : " + questionAct.getTitreQuestion());
            System.out.println("[1]" + questionAct.getReponse1());
            System.out.println("[2]" + questionAct.getReponse2());
            System.out.println("[3]" + questionAct.getReponse3());
            System.out.println("[4]" + questionAct.getReponse4());
            
            Scanner clavierScanner = new Scanner(System.in);
            repJoueur = clavierScanner.nextInt();
            
            
            
        }
    }
}
