package org.academiadecodigo.battleship.sound;

public enum SoundType {
    START("theme.wav"),
    HIT("hit2.wav"),
    MISS("miss2.wav"),
    EXPLOSION("explosion.mp3"),
    END("end.wav");

    private String path;

    SoundType(String path) {
        this.path = "/resources/" + path;
    }

    public String getPath() {
        return path;
    }

}