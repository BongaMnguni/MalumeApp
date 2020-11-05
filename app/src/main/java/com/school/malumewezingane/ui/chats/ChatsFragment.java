package com.school.malumewezingane.ui.chats;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.school.malumewezingane.R;

public class ChatsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View rootview = inflater.inflate(R.layout.fragment_chats, container, false);
        return rootview;
    }
}