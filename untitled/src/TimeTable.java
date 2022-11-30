import java.util.*;


public class TimeTable {
    private List<Course> courseList = new List<Course>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Course> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Course course) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Course> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Course> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Course get(int index) {
            return null;
        }

        @Override
        public Course set(int index, Course element) {
            return null;
        }

        @Override
        public void add(int index, Course element) {

        }

        @Override
        public Course remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Course> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Course> listIterator(int index) {
            return null;
        }

        @Override
        public List<Course> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
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

    public void editTimeTable()
    {
        System.out.println("Add or Remove");
        Scanner sc = new Scanner(System.in);
        Course editCourse = new Course();
        switch (sc.nextLine()){
            case ("Add"):
                editCourse.toAddNewCourse();
                this.addCourse(editCourse);
                break;
            default:
                break;
        }


    }

    public static void main(String args[])
    {
        TimeTable TT = new TimeTable();
        TT.editTimeTable();

        System.out.println(TT.courseList.get());
    }

}

