package com.example.android.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link PlayListAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link PlayList} objects.
 */
public class PlayListAdapter extends ArrayAdapter<PlayList> {

    /**
     * Create a new {@link PlayListAdapter} object.
     *
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param playlists is the list of {@link PlayList}s to be displayed.
     */
    public PlayListAdapter(Context context, ArrayList<PlayList> playlists) {
        super(context, 0, playlists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Playlist} object located at this position in the list
        PlayList currentPlaylist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the Artist from the playlist java file Playlist
        artistTextView.setText(currentPlaylist.getArtist());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title_text_view);
        // Get the Song Title from the java file PlayList
        songTitleTextView.setText(currentPlaylist.getSongTitle());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
