public class Main {
    public static void main(String[] args) {
        String[] myTasks = {"Проснуться", "Поесть", "поделать дела", "Лечь спать"};
        Task task = new Task(Week.FRIDAY,myTasks);
        Iterator iterator = task.getIterator();
        System.out.println("День недели:" + task.getDay());
        System.out.println("Задачи: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
