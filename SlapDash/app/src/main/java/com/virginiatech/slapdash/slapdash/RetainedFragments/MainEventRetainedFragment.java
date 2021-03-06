package com.virginiatech.slapdash.slapdash.RetainedFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlacePhotoMetadataBuffer;
import com.virginiatech.slapdash.slapdash.DataModelClasses.Event;
import com.virginiatech.slapdash.slapdash.MainActivityFragmentsInterface;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by nima on 10/21/16.
 */
public class MainEventRetainedFragment extends Fragment implements MainActivityFragmentsInterface{

    @Getter @Setter private Event currentEvent;
    @Getter @Setter private List<Event> currentEventList;
    @Getter @Setter private Place currentEventPlace;

    public MainEventRetainedFragment(){}

    public static MainEventRetainedFragment newInstance(){
        MainEventRetainedFragment fragment = new MainEventRetainedFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public boolean onCurrentMainEventChanged(Event newCurrentEvent) {
        currentEvent = newCurrentEvent;
        return true;
    }

    @Override
    public boolean onCurrentEventPlaceChanged(Place newPlace) {
        currentEventPlace = newPlace;
        return true;
    }

    @Override
    public boolean onCurrentEventPictureChanged(PlacePhotoMetadataBuffer buffer, GoogleApiClient mGoogleApiClient) {
        return false;
    }
}
