package EvalTypes;

public class EvalCommon {
    private float maxMarks;
    private float scoredMarks;
    private double evalWeightage;
    private String title;

    public EvalCommon(float maxMarks, float scoredMarks, double evalWeightage, String title) {
        this.maxMarks = maxMarks;
        this.scoredMarks = scoredMarks;
        this.evalWeightage = evalWeightage;
        this.title = title;
    }


    public float getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(float maxMarks) {
        this.maxMarks = maxMarks;
    }

    public float getScoredMarks() {
        return scoredMarks;
    }

    public void setScoredMarks(float scoredMarks) {
        this.scoredMarks = scoredMarks;
    }

    public double getEvalWeightage() {
        return evalWeightage;
    }

    public void setEvalWeightage(float evalWeightage) {
        this.evalWeightage = evalWeightage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}