package com.sachin.tworks.cm;



import java.util.ArrayList;
import java.util.List;

public class Conference {
    private List<Track> tracks;

    public Conference() {
        tracks = new ArrayList<Track>();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Conference Schedule:" + "\n" + "\n" );
        for (int i = 0; i < tracks.size(); i++) {
            str.append("Track " + (i + 1) + ":" + "\n");
            str.append(tracks.get(i));
            str.append("\n");
        }
        return str.toString();
    }
    
    public List<Track> getTracks()
    {
    	return tracks;
    }
}
