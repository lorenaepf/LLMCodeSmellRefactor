package org.example.studymaterial;

public class AudioReference extends Reference {
    public enum AudioQuality {
        LOW, MEDIUM, HIGH, VERY_HIGH;
    }
    private AudioQuality audioQuality;

    AudioReference(AudioQuality quality){
        this.audioQuality = quality;
    }

    public AudioQuality getAudioQuality() {
        return audioQuality;
    }
    public void setAudioQuality(AudioQuality audioQuality) {
        this.audioQuality = audioQuality;
    }

}
