import java.util.*;


public class TimeTable {
    static int courseCount = 0;
    static List<Course> courseList = new ArrayList<Course>();

    public void editTimeTable()
    {
        System.out.println("Add or Remove");
        Scanner sc = new Scanner(System.in);
        Course editCourse = new Course();
        switch (sc.nextLine()){
            case ("Add"):
                Iterator<Course> itr1 = courseList.listIterator();
                boolean present = false;
                editCourse.toAddNewCourse();
                while(itr1.hasNext())
                {
                    if(itr1.next().equals(editCourse));
                    {
                        System.out.println("Course already present");
                        present = true;
                        break;
                    }
                }
                if(!present)
                {
                    courseList.add(editCourse);
                    System.out.println("Course is added");
                    courseCount++;
                }
                break;

            case ("Remove"):
                Iterator<Course> itr2 = courseList.listIterator();
                boolean absent = false;
                editCourse.toAddNewCourse();
                while(itr2.hasNext())
                {
                    if(itr2.next().equals(editCourse));
                    {
                        courseList.remove(editCourse);
                        System.out.println("Course is removed");
                        courseCount--;
                        absent=true;
                        break;
                    }
                }
                if(!absent)
                {
                    System.out.println("Course already absent");
                }
                break;
            default:
                break;
        }
    }

    public void displayTT()
    {
        Iterator<Course> itr = courseList.listIterator();
        while(itr.hasNext())
        {
            Course next = itr.next();
            System.out.println("Course Name - " + next.getCourseTitle());
            System.out.println("Course Units - " + next.getCourseUnits());
            System.out.println("Lecture Section - "+ next.getLectureSection());
            System.out.println("Tutorial Section - "+next.getTutorialSection());
            System.out.println("Tutorial Hour - " + next.getTutorialHour());
            System.out.println("Lab Section - " +next.getLabSection());
            System.out.println("Lab Hour - "+next.getLabHour());
            System.out.println("\n \n");
        }
    }


    public Course getCourse(int index) {
        return courseList.get(index);
    }



}
