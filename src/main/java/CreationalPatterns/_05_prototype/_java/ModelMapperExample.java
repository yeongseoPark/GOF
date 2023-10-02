package CreationalPatterns._05_prototype._java;

import CreationalPatterns._05_prototype._02_after.GithubIssue;
import CreationalPatterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제~~~~");

        // Flat한 구조를 가진 GithubIssueData에 GithubIssue를 옮겨담고 싶음 : ModelMapper 사용
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData map = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(map);
    }
}
