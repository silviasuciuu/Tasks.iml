package tasks.services;


import javafx.collections.ObservableList;
import org.apache.log4j.Logger;
import tasks.model.LinkedTaskList;
import tasks.model.Task;
import tasks.model.TaskList;
import tasks.repo.TaskIORepo;
import tasks.view.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskIO {
    public static TaskIORepo taskIORepo = new TaskIORepo();

    public static void write(TaskList tasks, OutputStream out) throws IOException {
        taskIORepo.write(tasks, out);
    }

    public static void read(TaskList tasks, InputStream in) throws IOException {
        taskIORepo.read(tasks, in);
    }

    public static void writeBinary(TaskList tasks, File file) throws IOException {
        taskIORepo.writeBinary(tasks, file);
    }

    public static void readBinary(TaskList tasks, File file) throws IOException {
        taskIORepo.readBinary(tasks, file);
    }

    public static void write(TaskList tasks, Writer out) throws IOException {
        taskIORepo.write(tasks, out);

    }

    public static void read(TaskList tasks, Reader in) throws IOException {
        taskIORepo.read(tasks, in);

    }

    public static void writeText(TaskList tasks, File file) throws IOException {
        taskIORepo.writeText(tasks, file);

    }

    public static void readText(TaskList tasks, File file) throws IOException {
        taskIORepo.readText(tasks, file);
    }

    //// service methods for reading
    private static Task getTaskFromString(String line) {
        return taskIORepo.getTaskFromString(line);
    }

    //
    private static int getIntervalFromText(String line) {
        return taskIORepo.getIntervalFromText(line);
    }

    private static Date getDateFromText(String line, boolean isStartTime) {
        return taskIORepo.getDateFromText(line, isStartTime);

    }

    private static String getTitleFromText(String line) {
        return taskIORepo.getTitleFromText(line);
    }


    ////service methods for writing
    private static String getFormattedTask(Task task) {
        return taskIORepo.getFormattedTask(task);
    }

    public static String getFormattedInterval(int interval) {
        return taskIORepo.getFormattedInterval(interval);
    }


    public static void rewriteFile(ObservableList<Task> tasksList) {
        taskIORepo.rewriteFile(tasksList);
    }
}
