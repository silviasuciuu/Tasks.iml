package tasks.services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tasks.model.ArrayTaskList;
import tasks.model.Task;
import tasks.model.TasksOperations;
import tasks.repo.TaskRepo;

import java.util.Date;

public class TasksService {

    private ArrayTaskList tasks;
    public TaskRepo taskRepo ;

    public TasksService(ArrayTaskList tasks) {
        this.tasks = tasks;
        this.taskRepo=new TaskRepo(tasks);
    }

    public ObservableList<Task> getObservableList() {
        //return FXCollections.observableArrayList(tasks.getAll());
        return taskRepo.getObservableList();
    }

    public String getIntervalInHours(Task task) {
        return taskRepo.getIntervalInHours(task);
    }


    public int parseFromStringToSeconds(String stringTime) {//hh:MM
        return taskRepo.parseFromStringToSeconds(stringTime);
    }

    public Iterable<Task> filterTasks(Date start, Date end) {
        return taskRepo.filterTasks(start, end);

    }

    public String formTimeUnit(int timeUnit) {
        return taskRepo.formTimeUnit(timeUnit);
    }

}
