package repository;

import domain.Issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IssueRepository {
    private List<Issue> issues = new ArrayList<>();

    public List<Issue> getAll() {
        return issues;
    }

    public boolean add(Issue issue) {
        return issues.add(issue);
    }

    public boolean addAll(Collection<Issue> issues) {
        return this.issues.addAll(issues);
    }

    public List<Issue> getOpen() {
        for (Issue issue : issues) {
            if (!issue.isClosed()) {
                System.out.println(issue);
            }
        }
        return issues;
    }

    public List<Issue> getClosed() {
        for (Issue issue : issues) {
            if (issue.isClosed()) {
                System.out.println(issue);
            }
        }
        return issues;
    }

    public List<Issue> getByAuthor(String author) {
        for (Issue issue : issues) {
            if (issue.getAuthor().contains(author)) {
                System.out.println(issue);
            }
        }
        return issues;
    }

   //fixme: реализовать фильтрацию по Label
   //fixme: реализовать фильтрацию по assignee

    public void updateById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                if (issue.isClosed()) {
                    issue.setClosed(false);
                } else {
                    issue.setClosed(true);
                }
            }
        }
    }
}
