import java.util.List;

public class TimeTable {

    private List<Course> courseList;

    public TimeTable(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course newCourse)
    {
        if(courseList.contains(newCourse))
        {
            System.out.println("Course already present");
        }
        else
        {
            courseList.add(newCourse);
            System.out.println("Course is added");
        }
    }

    public void deleteCourse(Course delCourse)
    {
        if(courseList.contains(delCourse))
        {
            courseList.remove(delCourse);
            System.out.println("Course removed Successfully");
        }
        else
        {
            System.out.println("Course is absent");
        }
    }

    
}
