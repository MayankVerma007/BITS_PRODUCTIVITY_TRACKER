package EvalTypes;

public class MidSemester extends EvalCommon{

    private float avMidSem;
    public MidSemester(float maxMarks, float scoredMarks, double evalWeightage, float avMidSem, String title) {
        super(maxMarks, scoredMarks, evalWeightage, title);
        this.avMidSem = avMidSem;
    }
}