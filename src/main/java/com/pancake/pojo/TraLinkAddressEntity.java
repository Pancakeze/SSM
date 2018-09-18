package com.pancake.pojo;

import javax.persistence.*;

/**
 * Created by zhibingze on 2018/9/13.
 */
@Entity
@Table(name = "tra_link_address", schema = "tracing_process", catalog = "")
public class TraLinkAddressEntity {
    private long id;
    private Long linkId;
    private Long addressIs;
    private Long addressId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "link_id")
    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "address_is")
    public Long getAddressIs() {
        return addressIs;
    }

    public void setAddressIs(Long addressIs) {
        this.addressIs = addressIs;
    }

    @Basic
    @Column(name = "address_id")
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraLinkAddressEntity that = (TraLinkAddressEntity) o;

        if (id != that.id) return false;
        if (linkId != null ? !linkId.equals(that.linkId) : that.linkId != null) return false;
        if (addressIs != null ? !addressIs.equals(that.addressIs) : that.addressIs != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        result = 31 * result + (addressIs != null ? addressIs.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        return result;
    }
}
