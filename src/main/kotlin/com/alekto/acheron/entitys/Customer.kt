package com.alekto.acheron.entitys

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Customer {
    @Id
    @GeneratedValue
    private var id: Long? = null
    private var name: String = "null"
    private var role: String = "";


    constructor() {}
    constructor(name: String, role: String) {
        this.name = name
        this.role = role
    }
}