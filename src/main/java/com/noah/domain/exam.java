package com.noah.domain;

public class exam {
    private Integer quesId;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String Choose;
    private String ChooseT;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getChooseT() {
        return ChooseT;
    }

    public String getChoose() {
        return Choose;
    }

    public void setChoose(String choose) {
        Choose = choose;
    }

    public void setChooseT(String choseT) {
        ChooseT = choseT;
    }

    @Override
    public String toString() {
        return "exam{" +
                "quesId=" + quesId +
                ", question='" + question + '\'' +
                ", answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answerD='" + answerD + '\'' +
                ", Choose='" + Choose + '\'' +
                ", ChooseT='" + ChooseT + '\'' +
                '}';
    }
}
