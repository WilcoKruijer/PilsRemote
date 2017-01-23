package nl.svia.pilsremote.misc;

public class UserObject {
    private int mId;
    private String mName;

    public UserObject(int id, String name) {
        mId = id;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        UserObject user = (UserObject) obj;

        if (mId != user.mId) {
            return false;
        }

        return mName != null ? mName.equals(user.mName) : user.mName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (mId ^ (mId >>> 32));
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserObject: " + mName + ", " + mId;
    }
}