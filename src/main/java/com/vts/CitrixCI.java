package com.vts;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CitrixCIs")
@Cacheable
public class CitrixCI extends PanacheEntity {
	public String CI_NAME;    
	public String CI_PLATFORM;
    public String CI_INFO;
    public String ENVIRONMENT;
    public String SOFTWARE_VERSION;
}
