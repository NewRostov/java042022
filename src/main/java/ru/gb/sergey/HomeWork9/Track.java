package ru.gb.sergey.HomeWork9;

public class Track implements Obtacles {

    private Integer distance;

    public Track(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public void overcome(Participants participant) {
        participant.run(this);
    }
}
