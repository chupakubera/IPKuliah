package com.chupakubera.ipkuliah.ui.jadwalkuliah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Akan diisi dengan tabel matakuliah yang sedang diambil disertai jadwal kuliahnya");
    }

    public LiveData<String> getText() {
        return mText;
    }
}