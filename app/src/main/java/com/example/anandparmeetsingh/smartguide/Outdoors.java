package com.example.anandparmeetsingh.smartguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ParmeetSingh on 4/2/2017.
 */

public class Outdoors extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.iG), getString(R.string.r4_6), getString(R.string.triumphal),
                R.drawable.indiagate));
        words.add(new Word(getString(R.string.qM), getString(R.string.r4_5), getString(R.string.victory),
                R.drawable.qutubminar));
        words.add(new Word(getString(R.string.rG), getString(R.string.r4_5), getString(R.string.gandhi),
                R.drawable.rajghat));
        words.add(new Word(getString(R.string.nZP), getString(R.string.r4_2), getString(R.string.sprawling),
                R.drawable.nationzoological));
        words.add(new Word(getString(R.string.nRM), getString(R.string.r4_3), getString(R.string.railway),
                R.drawable.nationrailmuseum));
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.recycler);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
