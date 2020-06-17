package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockListerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        // Create a playlist
        ArrayList<PlayList> playlists = new ArrayList<PlayList>();
        playlists.add(new PlayList(getString(R.string.artist1), getString(R.string.song1)));
        playlists.add(new PlayList(getString(R.string.artist2), getString(R.string.song2)));
        playlists.add(new PlayList(getString(R.string.artist3), getString(R.string.song3)));
        playlists.add(new PlayList(getString(R.string.artist4), getString(R.string.song4)));
        playlists.add(new PlayList(getString(R.string.artist5), getString(R.string.song5)));
        playlists.add(new PlayList(getString(R.string.artist6), getString(R.string.song6)));
        playlists.add(new PlayList(getString(R.string.artist7), getString(R.string.song7)));
        playlists.add(new PlayList(getString(R.string.artist8), getString(R.string.song8)));
        playlists.add(new PlayList(getString(R.string.artist9), getString(R.string.song9)));
        playlists.add(new PlayList(getString(R.string.artist10), getString(R.string.song10)));

        // Create a {@link PlayAdapter}, whose data source is a list of {@link Playlists. The
        // adapter knows how to create list items for each item in the list.
        PlayListAdapter adapter = new PlayListAdapter(this, playlists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // playlist.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlayListAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Playlist} in the list.
        listView.setAdapter(adapter);
    }
}