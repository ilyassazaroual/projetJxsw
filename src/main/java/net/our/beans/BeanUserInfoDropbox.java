package net.our.beans;

public class BeanUserInfoDropbox
{
    private String uid;

    private String referral_link;

    private String display_name;

    private String email;

    private String email_verified;

    private Name_details name_details;

    private String locale;

    private String team;

    private Quota_info quota_info;

    private String is_paired;

    private String country;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getReferral_link ()
    {
        return referral_link;
    }

    public void setReferral_link (String referral_link)
    {
        this.referral_link = referral_link;
    }

    public String getDisplay_name ()
    {
        return display_name;
    }

    public void setDisplay_name (String display_name)
    {
        this.display_name = display_name;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getEmail_verified ()
    {
        return email_verified;
    }

    public void setEmail_verified (String email_verified)
    {
        this.email_verified = email_verified;
    }

    public Name_details getName_details ()
    {
        return name_details;
    }

    public void setName_details (Name_details name_details)
    {
        this.name_details = name_details;
    }

    public String getLocale ()
    {
        return locale;
    }

    public void setLocale (String locale)
    {
        this.locale = locale;
    }

    public String getTeam ()
    {
        return team;
    }

    public void setTeam (String team)
    {
        this.team = team;
    }

    public Quota_info getQuota_info ()
    {
        return quota_info;
    }

    public void setQuota_info (Quota_info quota_info)
    {
        this.quota_info = quota_info;
    }

    public String getIs_paired ()
    {
        return is_paired;
    }

    public void setIs_paired (String is_paired)
    {
        this.is_paired = is_paired;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", referral_link = "+referral_link+", display_name = "+display_name+", email = "+email+", email_verified = "+email_verified+", name_details = "+name_details+", locale = "+locale+", team = "+team+", quota_info = "+quota_info+", is_paired = "+is_paired+", country = "+country+"]";
    }
public class Name_details
{
    private String familiar_name;

    private String surname;

    private String given_name;

    public String getFamiliar_name ()
    {
        return familiar_name;
    }

    public void setFamiliar_name (String familiar_name)
    {
        this.familiar_name = familiar_name;
    }

    public String getSurname ()
    {
        return surname;
    }

    public void setSurname (String surname)
    {
        this.surname = surname;
    }

    public String getGiven_name ()
    {
        return given_name;
    }

    public void setGiven_name (String given_name)
    {
        this.given_name = given_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [familiar_name = "+familiar_name+", surname = "+surname+", given_name = "+given_name+"]";
    }
}
public class Quota_info
{
    private String shared;

    private String quota;

    private String normal;

    private String datastores;

    public String getShared ()
    {
        return shared;
    }

    public void setShared (String shared)
    {
        this.shared = shared;
    }

    public String getQuota ()
    {
        return quota;
    }

    public void setQuota (String quota)
    {
        this.quota = quota;
    }

    public String getNormal ()
    {
        return normal;
    }

    public void setNormal (String normal)
    {
        this.normal = normal;
    }

    public String getDatastores ()
    {
        return datastores;
    }

    public void setDatastores (String datastores)
    {
        this.datastores = datastores;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shared = "+shared+", quota = "+quota+", normal = "+normal+", datastores = "+datastores+"]";
    }
}
}
