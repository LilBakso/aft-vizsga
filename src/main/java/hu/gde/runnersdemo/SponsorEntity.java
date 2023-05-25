package hu.gde.runnersdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SponsorID;
    private String SponsorName;

    @JsonIgnore
    @OneToMany
    private List<RunnerEntity> runner;

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

    public List<RunnerEntity> getRunner() {
        return runner;
    }

}
