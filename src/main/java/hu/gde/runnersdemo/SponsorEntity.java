package hu.gde.runnersdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SponsorID;
    private String SponsorName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(nullable = false)
    private RunnerEntity runner;

    public long getSponsorID() {
        return SponsorID;
    }

    public void setSponsorID(long sponsorID) {
        SponsorID = sponsorID;
    }

    public String getSponsorName() {
        return SponsorName;
    }

    public void setSponsorName(String sponsorName) {
        SponsorName = sponsorName;
    }

    public RunnerEntity getRunner() {
        return runner;
    }

    public void setRunner(RunnerEntity runner) {
        this.runner = runner;
    }
}
