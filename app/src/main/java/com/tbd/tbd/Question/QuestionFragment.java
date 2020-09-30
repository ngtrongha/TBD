package com.tbd.tbd.Question;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.tbd.tbd.MainActivity;
import com.tbd.tbd.R;

public class QuestionFragment extends Fragment {

    private WebView webView;
    static private String url="https://www.arealme.com/career/vi/";
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_question, container, false);
        final WebView webView = root.findViewById(R.id.webview_question);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(url);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        return root;
    }
}