package com.kpz;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public final class Contact implements Cloneable, Serializable {

    private final String name;
    private final String mobile;
    private final Date creationDate;

    public Contact(String name, String mobile, Date creationDate) {
        this.name = name;
        this.mobile = mobile;
        this.creationDate = new Date(creationDate.getTime());
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    @Override
    public int hashCode() {
        return name.hashCode() * mobile.hashCode() * creationDate.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object == null)
            return false;

        if (getClass() != object.getClass())
            return false;

        Contact contact = (Contact) object;

        return Objects.equals(name, contact.name)
                && Objects.equals(mobile, contact.mobile)
                && contact.creationDate.equals(creationDate);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return String.format("Contact name: %s; Mobile: %s; Date of creation: %s",
                name, mobile, dateFormat.format(creationDate));
    }
}

