package com.manu.screenmatcher.models;

public class Title {
    private String name;
    private String description;
    private int releaseYear;
    private boolean includedInPlan;
    private double ratingSum;
    private int totalRating;
    private int durationInMinutes;

    public void showMovieDetails() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Descrição do filme: " + description);
        System.out.println("Incluso no plano? " + includedInPlan);
        System.out.println("Avaliações do filme: " + ratingSum);
        System.out.println("Avaliações geral: " + totalRating);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void ratings(double rating) {
        ratingSum += rating;
        totalRating++;
    }

    public double obtainSumOfRatings() {
        double sum = ratingSum / totalRating;
        return sum;
    }

    public int getRating() {
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum = ratingSum;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
