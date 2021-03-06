package com.packtpub.apps.rxjava_essentials.apps;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(prefix = "m")
public class AppInfo implements Comparable<Object> {

    long mLastUpdateTime;

    String mName;

    String mIcon;


    public AppInfo(String name, String icon, long lastUpdateTime) {
        mName = name;
        mIcon = icon;
        mLastUpdateTime = lastUpdateTime;
    }

    public String getName(){
        return mName;
    }
    public String getIcon(){
        return mIcon;
    }
    public void setName(String name){
        mName = name;
    }
    public void setIcon(String icon){
        mIcon = icon;
    }

    @Override
    public int compareTo(Object another) {
        AppInfo f = (AppInfo) another;
        return getName().compareTo(f.getName());
    }
}
