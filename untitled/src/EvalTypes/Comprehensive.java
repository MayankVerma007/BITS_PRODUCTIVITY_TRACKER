package EvalTypes;

public class Comprehensive extends EvalCommon{

    private float avCompre;


    public Comprehensive(float maxMarks, float scoredMarks, double evalWeightage, float avCompre, String title) {
        super(maxMarks, scoredMarks, evalWeightage, title);
        this.avCompre=avCompre;
    }
}