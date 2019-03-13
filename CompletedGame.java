package com.bowling.edward.bowling;

public class CompletedGame {



    private int averageFrame, finalScore, strikeCount, spareCount, clearCount;
    public CompletedGame(){

    }

    public CompletedGame(int averageFrame, int finalScore, int strikeCount, int spareCount, int clearCount){
        this.averageFrame = averageFrame;
        this.finalScore = finalScore;
        this.strikeCount = strikeCount;
        this.spareCount = spareCount;
        this.clearCount = clearCount;
    }

    public int getAverageFrame() {
        return averageFrame;
    }

    public void setAverageFrame(int averageFrame) {
        this.averageFrame = averageFrame;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getSpareCount() {
        return spareCount;
    }

    public void setSpareCount(int spareCount) {
        this.spareCount = spareCount;
    }

    public int getClearCount() {
        return clearCount;
    }

    public void setClearCount(int clearCount) {
        this.clearCount = clearCount;
    }
}
