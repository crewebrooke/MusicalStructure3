package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BluesListerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        // Create a playlist
        ArrayList<PlayList> playlists = new ArrayList<PlayList>();
        playlists.add(new PlayList("Lorem ipsum", "thoughtful"));
        playlists.add(new PlayList("Dolor sit", "scan"));
        playlists.add(new PlayList("Consectetuer", "loud"));
        playlists.add(new PlayList("Adipiscing elit", "delicate"));
        playlists.add(new PlayList("Diam", "rate"));
        playlists.add(new PlayList("Nonummy nibh", "society"));
        playlists.add(new PlayList("Tincidunt", "advertise"));
        playlists.add(new PlayList("Ut laoreet", "feature"));
        playlists.add(new PlayList("Magna", "teacher"));
        playlists.add(new PlayList("Aliquam erat", "agree"));

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