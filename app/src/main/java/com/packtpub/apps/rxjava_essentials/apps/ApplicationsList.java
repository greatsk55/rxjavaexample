package com.packtpub.apps.rxjava_essentials.apps;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(prefix = "m")
public class ApplicationsList {

    private static ApplicationsList ourInstance = new ApplicationsList();

    @Getter
    @Setter
    private List<AppInfo> mList;

    private ApplicationsList() {
    }

    public void setList(List<AppInfo> list){
        mList = list;
    }
    public List<AppInfo> getList(){
        return mList;
    }

    public static ApplicationsList getInstance() {
        return ourInstance;
    }
}
