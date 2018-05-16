package co.oneware.masterpass;

public class Pass {

    public String mName;
    public String mUsername;
    public String mURL;
    public String mPassword;
    public String mNotes;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmURL() {
        return mURL;
    }

    public void setmURL(String mURL) {
        this.mURL = mURL;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmNotes() {
        return mNotes;
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }

    public Pass(String mName, String mUsername, String mURL, String mPassword, String mNotes) {
        this.mName = mName;
        this.mUsername = mUsername;
        this.mURL = mURL;
        this.mPassword = mPassword;
        this.mNotes = mNotes;
    }

    public Pass() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

}
