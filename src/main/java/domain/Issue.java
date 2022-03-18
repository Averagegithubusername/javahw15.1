package domain;

import java.util.HashSet;

public class Issue implements Comparable<Issue> {
    private int id;
    private boolean isClosed;
    private String author;
    private HashSet<String> label;
    private HashSet<String> assignee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public HashSet<String> getLabel() {
        return label;
    }

    public void setLabel(HashSet<String> label) {
        this.label = label;
    }

    public HashSet<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(HashSet<String> assignee) {
        this.assignee = assignee;
    }

    public Issue() {
    }

    public Issue(int id, boolean isClosed, String author, HashSet<String> label, HashSet<String> assignee) {
        this.id = id;
        this.isClosed = isClosed;
        this.author = author;
        this.label = label;
        this.assignee = assignee;
    }

    @Override
    public int compareTo(Issue o) {
        return id - o.id;
    }
}
