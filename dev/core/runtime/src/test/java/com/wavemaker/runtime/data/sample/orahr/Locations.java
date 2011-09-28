/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wavemaker.runtime.data.sample.orahr;
// Generated Aug 19, 2007 9:06:50 PM by Hibernate Tools 3.2.0.b9


import java.util.HashSet;
import java.util.Set;

/**
 * Locations generated by hbm2java
 */
@SuppressWarnings({"serial", "unchecked"})
public class Locations  implements java.io.Serializable {


     private short locationId;
     private Countries countries;
     private String streetAddress;
     private String postalCode;
     private String city;
     private String stateProvince;
     private Set departmentses = new HashSet(0);

    public Locations() {
    }

	
    public Locations(short locationId, String city) {
        this.locationId = locationId;
        this.city = city;
    }
    public Locations(short locationId, Countries countries, String streetAddress, String postalCode, String city, String stateProvince, Set departmentses) {
       this.locationId = locationId;
       this.countries = countries;
       this.streetAddress = streetAddress;
       this.postalCode = postalCode;
       this.city = city;
       this.stateProvince = stateProvince;
       this.departmentses = departmentses;
    }
   
    public short getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(short locationId) {
        this.locationId = locationId;
    }
    public Countries getCountries() {
        return this.countries;
    }
    
    public void setCountries(Countries countries) {
        this.countries = countries;
    }
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
    public Set getDepartmentses() {
        return this.departmentses;
    }
    
    public void setDepartmentses(Set departmentses) {
        this.departmentses = departmentses;
    }




}

