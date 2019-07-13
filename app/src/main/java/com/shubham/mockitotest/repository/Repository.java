package com.shubham.mockitotest.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

public class Repository {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public String getData() {
        return "This is data";
    }

    public void getvalues(String a, String b) {
        Log.d("<<<<<", a + b);
    }

    public MutableLiveData<String> getMutableLiveData(String name, String pass) {
        mutableLiveData.setValue(name + pass);
        return mutableLiveData;
    }
}
