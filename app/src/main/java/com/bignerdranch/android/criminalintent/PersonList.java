package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chris on 3/21/2017.
 */

public class PersonList {
    private static PersonList sPersonList;

    private List<FavoritePerson> mPeople;

    public static PersonList get(Context context){
        if(sPersonList == null){
            sPersonList = new PersonList(context);
        }
        return sPersonList;
    }

    private PersonList(Context context){
        mPeople = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            FavoritePerson person = new FavoritePerson();
            person.setPersonName("Yolo is my name. ");
            mPeople.add(person);
        }
    }

    public List<FavoritePerson> getCrimes(){
        return mPeople;
    }

    public Crime getPerson(UUID crimeId){
        for(int i = 0; i < mPeople.size(); i++){
            if (mPeople.get(i).getID().equals(crimeId)){
                return mPeople.get(i);
            }
        }

        return null;
    }
}
