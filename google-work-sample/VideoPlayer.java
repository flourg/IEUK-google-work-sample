package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");
    ArrayList<Video> allVideos = new ArrayList<Video>();
    for (Video v : videoLibrary.getVideos()) {
      allVideos.add(v);
    }
    Collections.sort(allVideos, Comparator.comparing(Video::getTitle));

    for(Video s : allVideos){
      System.out.println("\t" + s.getTitle() + " (" + s.getVideoId() + ") "  + s.getTags() );}
  }

  public void playVideo(String videoId) {
    System.out.println("playVideo needs implementation");

  }

  public void stopVideo() {
    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    ArrayList<Video> results = new ArrayList<Video>();

    for (Video v : videoLibrary.getVideos()) {
      if (v.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
        results.add(v);
      }
        Collections.sort(results, Comparator.comparing(Video::getTitle));
    }

    if (results.isEmpty()){
      System.out.println("No search results for " + searchTerm);
    }
     else {
       System.out.println("Here are the results for: " + searchTerm);
        int i = 0;
        for (Video vid : results){
          System.out.println("\t" + (i + 1) + ") " + vid.getTitle() + " (" + vid.getVideoId() + ") " + vid.getTags());}

        System.out.println("Would you like to play any of the above? If yes, specify the number of the video.");
        System.out.println("If your answer is not a valid number, we assume it's a no.");
      }
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
    ArrayList<Video> hashResults = new ArrayList<Video>();

    for (Video v : videoLibrary.getVideos()) {
      if (v.getTags().contains(videoTag.toLowerCase())) {
        hashResults.add(v);
      }
      Collections.sort(hashResults, Comparator.comparing(Video::getTitle));
    }

    if (hashResults.isEmpty()){
      System.out.println("No search results for " + videoTag);
    }
    else {
      System.out.println("Here are the results for: " + videoTag);
      int i = 0;
      for (Video vid : hashResults){
        System.out.println("\t" + (i + 1) + ") " + vid.getTitle() + " (" + vid.getVideoId() + ") " + vid.getTags());}

      System.out.println("Would you like to play any of the above? If yes, specify the number of the video.");
      System.out.println("If your answer is not a valid number, we assume it's a no.");
    }
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}