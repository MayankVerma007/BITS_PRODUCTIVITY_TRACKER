package EvalTypes;

public class TutTest extends EvalCommon{

    private int bufferCount;

    public TutTest(float maxMarks, float scoredMarks, double evalWeightage, int bufferCount, String title) {
        super(maxMarks, scoredMarks, evalWeightage, title);
        this.bufferCount=bufferCount;
    }
}