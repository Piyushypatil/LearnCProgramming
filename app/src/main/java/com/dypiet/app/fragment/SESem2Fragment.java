package com.dypiet.app.fragment;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class SESem2Fragment extends SubjectsFragment {

    private String branch;
    private String year;


    @Override
    public Query getQuery() {
        Query query = FirebaseDatabase.getInstance ().getReference ().child ("Quiz").child (branch);
        return query;
    }

    public void setData( String branch){
        this.branch = branch;
    }

    @Override
    protected String getBranch() {
        return branch;
    }

}
