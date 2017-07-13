package com.example.dfrank.github.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by dfrank on 6/23/17.
 */

public class Owner implements Serializable, Parcelable {
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    public final static Creator<Owner> CREATOR = new Creator<Owner>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Owner createFromParcel(Parcel in) {
            Owner instance = new Owner();
            instance.login = ((String) in.readValue((String.class.getClassLoader())));
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.siteAdmin = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            return instance;
        }

        public Owner[] newArray(int size) {
            return (new Owner[size]);
        }

    }
            ;
    private final static long serialVersionUID = 7841252182080418313L;

    public String getLogin() {
        return login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }


    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(login);
        dest.writeValue(id);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(reposUrl);
        dest.writeValue(siteAdmin);
    }

    public int describeContents() {
        return  0;
    }

}
