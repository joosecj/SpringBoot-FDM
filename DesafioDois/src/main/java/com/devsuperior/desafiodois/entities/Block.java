package com.devsuperior.desafiodois.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_block")
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startBlock;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endBlock;

//    @OneToOne
//    @MapsId
//    private Activity activity;

    @OneToMany(mappedBy = "blocks")
    private List<Activity> activities = new ArrayList<>();

    public Block() {
    }

    public Block(Long id, Instant startBlock, Instant endBlock) {
        this.id = id;
        this.startBlock = startBlock;
        this.endBlock = endBlock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStartBlock() {
        return startBlock;
    }

    public void setStartBlock(Instant startBlock) {
        this.startBlock = startBlock;
    }

    public Instant getEndBlock() {
        return endBlock;
    }

    public void setEndBlock(Instant endBlock) {
        this.endBlock = endBlock;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}

