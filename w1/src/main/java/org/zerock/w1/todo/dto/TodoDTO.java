package org.zerock.w1.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
    private long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTno() {
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }
}
