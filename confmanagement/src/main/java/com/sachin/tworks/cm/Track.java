package com.sachin.tworks.cm;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<Talk> talks;

    public Track() {
        talks = new ArrayList<Talk>();
    }

    public void addTalk(Talk talk) {
        talks.add(talk);
    }

    public List<Talk> getTalks(){
    	return talks;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Talk talk : talks) {
            str.append(talk);
        }
        return str.toString();
    }
}
