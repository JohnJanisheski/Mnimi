package com.example.mnimi.ui.themes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThemesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThemesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Themes fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}