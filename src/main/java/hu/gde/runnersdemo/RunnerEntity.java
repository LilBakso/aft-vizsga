package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private long averagePace;
    private long runnerHeight;

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LapTimeEntity> laptimes = new ArrayList<>();
    @ManyToOne
    private SponsorEntity sponsors;


    public RunnerEntity() {
    }

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public long getAveragePace() {
        return averagePace;
    }

    public long getRunnerHeight() {
        return runnerHeight;
    }

    public void setRunnerHeight(long runnerHeight) {
        this.runnerHeight = runnerHeight;
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setAveragePace(long averagePace) {
        this.averagePace = averagePace;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }

    public SponsorEntity getSponsors() {
        return sponsors;
    }

    public void setSponsors(SponsorEntity sponsors) {
        this.sponsors = sponsors;
    }
}
