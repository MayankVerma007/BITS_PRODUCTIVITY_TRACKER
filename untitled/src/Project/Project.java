package Project;

public class Project {

    private String projectName;
    private String[] groupMembers;
    private String[] task;
    private String teamLead;
    private String courseCode;

    public Project(String projectName, String[] groupMembers, String[] task, String teamLead, String courseCode) {
        this.projectName = projectName;
        this.groupMembers = groupMembers;
        this.task = task;
        this.teamLead = teamLead;
        this.courseCode = courseCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String[] getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(String[] groupMembers) {
        this.groupMembers = groupMembers;
    }

    public String[] getTask() {
        return task;
    }

    public void setTask(String[] task) {
        this.task = task;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
