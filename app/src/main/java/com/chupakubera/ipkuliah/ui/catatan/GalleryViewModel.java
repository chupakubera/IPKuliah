package com.chupakubera.ipkuliah.ui.catatan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Akan diisi dengan daftar catatan penting perkuliahan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}