package com.shubham.mockitotest.repository;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryTest {

    @Mock
    Repository repository;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();
    
    @Test
    public void getData() {
        //Mocking repository in this case so using then return and @mock Annotation on top
       /* when(repository.getData()).thenReturn("This is mock string");
  ;*/

        //Using origin repository so using @Spy annotation on top and will have to use doreturn() method
/*
        doReturn(repository.getData()).when(repository).getData();
              System.out.println(repository.getData())*/

//Void case
//        doNothing().when(repository).getvalues("a", "b");

        //live data mock
/*        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("asda");
        when(repository.getMutableLiveData("a", "abc")).thenReturn(mutableLiveData);
        System.out.println(mutableLiveData.getValue());*/

        //live data real object
        when(repository.getMutableLiveData("a", "abc")).thenReturn(repository.mutableLiveData);
        System.out.println(repository.mutableLiveData.getValue());
    }
}