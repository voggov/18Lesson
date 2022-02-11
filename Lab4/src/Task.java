public class Task  implements Collect{
    private Week day;
    private String[] tasks;

    public Task(Week day, String[] tasks) {
        this.day = day;
        this.tasks = tasks;
    }

    public String getDay() {
        return day.getName();
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setDay(Week day) {
        this.day = day;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }
    private class TaskIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
