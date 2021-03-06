package com.example.kokogymfinaleproject.model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity extends BaseEntity {

    @OneToOne(optional = false)
    private UserEntity user;

    @ManyToOne
    private TrainerEntity trainer;

    @ManyToOne(optional = false)
    private LevelEntity level;

    public CustomerEntity() {
    }

    public CustomerEntity(UserEntity user, LevelEntity level) {
        this.user = user;
        this.level = level;
    }

    public UserEntity getUser() {
        return user;
    }

    public CustomerEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public TrainerEntity getTrainer() {
        return trainer;
    }

    public CustomerEntity setTrainer(TrainerEntity trainer) {
        this.trainer = trainer;
        return this;
    }

    public LevelEntity getLevel() {
        return level;
    }

    public CustomerEntity setLevel(LevelEntity level) {
        this.level = level;
        return this;
    }
}
