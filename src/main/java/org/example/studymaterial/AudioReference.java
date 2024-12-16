package org.example.studymaterial;

public class AudioReference extends Reference {
    public enum AudioQuality {
        LOW, MEDIUM, HIGH, VERY_HIGH;
    }
    private AudioQuality audioQuality;

    public AudioReference(AudioQuality quality){
        this.audioQuality = quality;
    }

    public AudioQuality getAudioQuality() {
        return audioQuality;
    }

    public void setAudioQuality(AudioQuality audioQuality) {
        this.audioQuality = audioQuality;
    }

     public void editAudio(AudioQuality audioQuality, String title, String description, String link, String accessRights, String license, boolean isDownloadable, int rating, String language, int viewCount, int shareCount, AudioQuality quality){
        editBasic(title, description, link);
        this.setAccessRights(accessRights);
        this.setLicense(license);
        this.setAudioQuality(audioQuality);
        editVideoAttributes(rating, language, viewCount, shareCount, isDownloadable, quality);

     }

     private void editVideoAttributes(int rating, String language, int viewCount, int shareCount,boolean isDownloadable, AudioQuality quality){
         this.setRating(rating);
         this.setShareCount(shareCount);
         this.setViewCount(viewCount);
         this.setAudioQuality(quality);
         this.setDownloadable(isDownloadable);
         this.setLanguage(language);
     }

     public void editBasic(String title, String description, String link){
         this.setTitle(title);
         this.setDescription(description);
         this.setLink(link);
     }

}
