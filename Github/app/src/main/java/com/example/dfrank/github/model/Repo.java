package com.example.dfrank.github.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by dfrank on 6/23/17.
 */

public class Repo implements Serializable, Parcelable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("language")
    @Expose
    private Object language;
    public final static Creator<Repo> CREATOR = new Creator<Repo>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Repo createFromParcel(Parcel in) {
            Repo instance = new Repo();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.fullName = ((String) in.readValue((String.class.getClassLoader())));
            instance.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
            instance._private = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.fork = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.forksUrl = ((String) in.readValue((String.class.getClassLoader())));;
            instance.languagesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.contributorsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.commitsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gitCommitsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.downloadsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.pullsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.milestonesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.createdAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.language = ((Object) in.readValue((Object.class.getClassLoader())));
            return instance;
        }

        public Repo[] newArray(int size) {
            return (new Repo[size]);
        }

    }
            ;
    private final static long serialVersionUID = 7000001125566100595L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public Owner getOwner() {
        return owner;
    }


    public Boolean getPrivate() {
        return _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getFork() {
        return fork;
    }

    public String getUrl() {
        return url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }


    public String getCommitsUrl() {
        return commitsUrl;
    }


    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }


    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }


    public String getUpdatedAt() {
        return updatedAt;
    }

    public Object getLanguage() {
        return language;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(fullName);
        dest.writeValue(owner);
        dest.writeValue(_private);
        dest.writeValue(htmlUrl);
        dest.writeValue(description);
        dest.writeValue(fork);
        dest.writeValue(url);
        dest.writeValue(forksUrl);
        dest.writeValue(languagesUrl);
        dest.writeValue(contributorsUrl);
        dest.writeValue(commitsUrl);
        dest.writeValue(gitCommitsUrl);
        dest.writeValue(downloadsUrl);
        dest.writeValue(pullsUrl);
        dest.writeValue(milestonesUrl);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(language);
    }

    public int describeContents() {
        return  0;
    }

}
