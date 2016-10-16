package ro.irian.fullstack.pizza.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Base class for all entities.
 */
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    protected BaseEntity() {
        this.id = UUIDGenerator.next();
    }

    public String getId() {
        if (this.id == null) {
            this.id = UUIDGenerator.next();
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public boolean isTransient() {
        return version == null;
    }

    public void prePersist() {
        if (this.id == null) {
            this.id = UUIDGenerator.next();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }

        BaseEntity that = (BaseEntity) o;

        return !(getId() != null ? !getId().equals(that.getId()) : that.getId() != null);

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
