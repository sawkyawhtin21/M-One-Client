package com.sawkyawhtin.mmovies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.sawkyawhtin.mmovies.R;

public class PlayLiveTVFragment extends Fragment {

    String link;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_play_live_t_v, container, false);
        WebView webView = myView.findViewById(R.id.webView);
        webView.loadUrl(link);
        MainActivity.toolbar.setVisibility(View.GONE);
        webView.getSettings().setJavaScriptEnabled(true);
        return myView;
    }
}