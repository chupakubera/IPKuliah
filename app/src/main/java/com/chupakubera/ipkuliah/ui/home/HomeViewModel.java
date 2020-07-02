package com.chupakubera.ipkuliah.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Akan diisi dengan tabel matakuliah yang telah diambila dan keterangnya ip, ipk, jumlah sks dan lainya");
    }

    public LiveData<String> getText() {
        return mText;
    }
}