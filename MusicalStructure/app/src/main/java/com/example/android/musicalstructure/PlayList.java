package com.example.android.musicalstructure;


/**
 * {@link PlayList} is a playlist that the user chooses to listen to
 */
public class PlayList {

    //Artist name/
    private String mArtist;

    //Song Title name/
    private String mSongTitle;

    /**
     * Create a new Playlist.
     *
     * @param artist    is the name of the artist
     * @param songTitle is the name of the song title
     */
    public PlayList(String artist, String songTitle) {
        mArtist = artist;
        mSongTitle = songTitle;
    }

    /**
     * Get the artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the song title
     */
    public String getSongTitle() {
        return mSongTitle;
    }

}


